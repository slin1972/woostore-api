package com.nodexy.woostore.server.util;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private final static ObjectMapper mapper = new ObjectMapper();

	private final static Logger LOG = LoggerFactory.getLogger(JsonUtil.class);  
	
	public static String objectToJson(Object object)
	{
		
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			LOG.error("Json convert error:"+e.getMessage());
		}
		return null;
	}
	
	public static <T> T jsonToObject(String json,Class<T> c)throws IOException
	{
		return mapper.readValue(json,c);
	}
}
