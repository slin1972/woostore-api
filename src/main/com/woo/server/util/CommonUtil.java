package com.woo.server.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtil {

	private final static Logger LOG = LoggerFactory.getLogger(CommonUtil.class);  
			
	public static void main(String[] args) {

		// System.out.println(generateCode());

		//System.out.println(md5("123456"));

		System.out.println(String.format("%s11111%s2222","11111","22222","#333"));
		//System.out.println(UUID.randomUUID().toString());
	}

	public static String generateCode() {
		StringBuffer sb = new StringBuffer()
				.append(new Random().nextInt(9) + 1)
				.append(new Random().nextInt(10))
				.append(new Random().nextInt(10))
				.append(new Random().nextInt(10));

		return sb.toString();
	}

	public static boolean sendSMS(String phone, String msg) {
		
		// TODO
		LOG.info("sendSMS to " + phone+" : " + msg);
		return true;
	}

	public static String md5(String s) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(s.getBytes("UTF8"));
			return hex(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String hex(byte[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; ++i) {
			sb.append(Integer.toHexString((arr[i] & 0xFF) | 0x100).substring(1,
					3));
		}
		return sb.toString();
	} 
}
