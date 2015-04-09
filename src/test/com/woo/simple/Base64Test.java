package com.woo.simple;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

import com.gexin.rp.sdk.base.uitls.MD5Util;

public class Base64Test {

	final static String charEnCodeType = "UTF-8";
	final static String private_key = "M8sNOPRKSUXZ4TJIcfg56F9uQ";
	public static String encode(String data) throws UnsupportedEncodingException {
		String md5key = MD5Util.getMD5Format(private_key);
		int x = 0;
		int len = data.length();
		int l = md5key.length();
		String cha = "";
		String str = "";
		for (int i = 0; i < len; i++) {
			if (x == l) {
				x = 0;
			}
			cha = cha + md5key.charAt(x);
			x++;
		}
		for (int i = 0; i < len; i++) {
			str = str
					+ (char) ((int) (data.charAt(i)) + ((int) (cha.charAt(i))) % 256);
		}
		byte[] s = Base64.encodeBase64(str.getBytes(charEnCodeType));
		return new String(s,charEnCodeType);
	}
	
	public static String decode(String url) throws UnsupportedEncodingException {
		String deCodeLinkStr = "";
		String key = MD5Util.getMD5Format(private_key);
		int x = 0;
		String tempStr = "";
		byte[] key2 = Base64.decodeBase64(url.getBytes(charEnCodeType));
		String data = new String(key2,charEnCodeType);
		int length = data.length();
		int keyLength = key.length();
		for (int i = 0; i < length; ++i) {
			if (x == keyLength) {
				x = 0;
			}
			tempStr = tempStr + key.substring(x, x + 1);
			++x;
		}
		for (int i = 0; i < length; ++i) {
			if (data.charAt(i) < tempStr.charAt(i)) {
				deCodeLinkStr = deCodeLinkStr
						+ (char) (data.charAt(i) + 'Ā' - tempStr.charAt(i));
			} else {
				deCodeLinkStr = deCodeLinkStr
						+ (char) (data.charAt(i) - tempStr.charAt(i));
			}
		}
		return deCodeLinkStr;
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = encode("av=0.0.1&os=5.0.1&m=Nexus%205&dpi=1776%2A1080&et=1423545691&phone=10001&password=924e666838439cd6b758808b42bc7b46&clientid=1475c4d8fc3a6d9ef2a756e178b6010d");
		System.out.println(s);
		System.out.println(decode(s));
	}
}
