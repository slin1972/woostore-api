package com.woo.push.getui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gexin.rp.sdk.base.IPushResult;
import com.gexin.rp.sdk.base.impl.ListMessage;
import com.gexin.rp.sdk.base.impl.Message;
import com.gexin.rp.sdk.base.impl.SingleMessage;
import com.gexin.rp.sdk.base.impl.Target;
import com.gexin.rp.sdk.http.IGtPush;
import com.gexin.rp.sdk.template.APNTemplate;
import com.gexin.rp.sdk.template.TransmissionTemplate;
import com.woo.push.IPushServer;
import com.woo.push.PushParams;
import com.woo.push.PushResult;
import com.woo.server.config.AppConfig;
import com.woo.server.util.JsonUtil;

@Component
public class GeTuiPushServer implements IPushServer {

	@Value("#{configProperties['getui.appId']}")
	private String appId ;
	@Value("#{configProperties['getui.appkey']}")
	private String appkey ;
	@Value("#{configProperties['getui.master']}")
	private String master ;
	@Value("#{configProperties['getui.host']}")
	private String host;
	private static final Logger LOG = LoggerFactory.getLogger(GeTuiPushServer.class);

	@Override
	public PushResult pushMessage(PushParams pushParams, String... deviceToken) {
		LOG.info("Push message [params:"+ JsonUtil.objectToJson(pushParams)+",deviceToken="+Arrays.asList(deviceToken));
		if(AppConfig.getInstance().isFunctionClose("push")){
			LOG.error("Push function close.");
			return PushResult.PUSH_FUNCTION_CLOSE;
		}
		if (deviceToken == null) {
			LOG.error("DeviceToken must contains one element.");
			return PushResult.DEVICETOKEN_NULL;
		}
		if (pushParams == null) {
			LOG.error("PushParams can't empty.");
			return PushResult.PARAMS_NULL;
		}
		PushResult res = null;

		try {

			switch (pushParams.getDevice()) {
			case 1:
				res = pushIOSMessage(pushParams, deviceToken);
				break;
			case 2:
				res = pushAndroidMessage(pushParams, deviceToken);
				break;
			case 0:
				List<String> d1 = null;
				List<String> d2 = null;
				for (int i = 0; i < deviceToken.length; i++) {
					if (deviceToken[i].length() > 32) {
						if (d1 == null) {
							d1 = new ArrayList<String>();
						}
						d1.add(deviceToken[i]);
					} else {
						if (d2 == null) {
							d2 = new ArrayList<String>();
						}
						d2.add(deviceToken[i]);
					}
				}
				if (d1 != null) {
					String[] array =new String[d1.size()];
					res = pushIOSMessage(pushParams,d1.toArray(array));
				}
				if (d2 != null) {
					String[] array =new String[d2.size()];
					res = pushAndroidMessage(pushParams,d2.toArray(array));
				}
				if (d1 != null && d2 != null) {
					res = PushResult.DEVICEID_DEFAULT_WARN;
				}
				break;
			default:
				res = PushResult.DEVICEID_ERROR;
				break;
			}
		} catch (Exception e) {
			LOG.error("Push exception.", e);
			return PushResult.EXCEPTION_RESULT;
		}
		return res;
	}
	
	
	IGtPush push = null;
	
	@PostConstruct
	public void initPush(){
		push = new IGtPush(host, appkey, master);
		System.setProperty("gexin.rp.sdk.pushlist.needDetails", "true");
		try {
			push.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/***
	 * 推送信息给IOS
	 * @param params
	 * @param deviceToken
	 * @return
	 * @throws Exception
	 */
	public PushResult pushIOSMessage(PushParams params,String ... deviceToken) throws Exception{
		IPushResult ret = null ;
		APNTemplate template = new APNTemplate();
		String payload = JsonUtil.objectToJson(params.getPayload());
		String locArgs = JsonUtil.objectToJson(params.getLocArgs());
		template.setPushInfo(params.getActionLocKey(), params.getBadge(), params.getMessage(), params.getSound(),payload, params.getLocKey(),locArgs, params.getLaunchImage(),params.getContentAvailable());
		boolean isList = deviceToken.length > 1;
		
		Message msg = isList ?new ListMessage() : new SingleMessage();
		msg.setData(template);
		
		if(isList){
			List<String> dtl = Arrays.asList(deviceToken);
			String contentId = push.getAPNContentId(appId, (ListMessage) msg);
			ret = push.pushAPNMessageToList(appId, contentId, dtl);
		}else{
			ret = push.pushAPNMessageToSingle(appId, deviceToken[0], (SingleMessage)msg);
		}
		return new PushResult(ret.getMessageId(),ret.getTaskId(),ret.getResultCode().name(),ret.getResponse());
	}
	/***
	 * 推送信息给Android
	 * @param userId
	 * @param jsonContent
	 * @return
	 */
	public PushResult pushAndroidMessage(PushParams params,String ... deviceToken){
		IPushResult ret = null ;
		//构造一个透传消息对象
		TransmissionTemplate template = new TransmissionTemplate();
		template.setAppId(appId);
		template.setAppkey(appkey);
		template.setTransmissionType(2);
		template.setTransmissionContent(JsonUtil.objectToJson(params));
		boolean isList = deviceToken.length > 1;
		Message msg = isList ?new ListMessage() : new SingleMessage();

		msg.setOffline(true);
		msg.setOfflineExpireTime(1 * 1000 * 3600);
		msg.setData(template);
		
		if(isList){
			List<Target> list = new ArrayList<Target>();
			Target target1 = null ;
			for (int i = 0; i < deviceToken.length; i++) {
				target1 = new Target();
				target1.setAppId(appId);
				target1.setClientId(deviceToken[i]);
				list.add(target1);
			}
			String contentId = push.getContentId((ListMessage) msg);
			ret = push.pushMessageToList(contentId,list);
		}else{
			Target target1 = new Target();
			target1.setAppId(appId);
			target1.setClientId(deviceToken[0]);
			ret = push.pushMessageToSingle((SingleMessage)msg,target1);
		}
		
		return new PushResult(ret.getMessageId(),ret.getTaskId(),ret.getResultCode().name(),ret.getResponse());
	}
}
