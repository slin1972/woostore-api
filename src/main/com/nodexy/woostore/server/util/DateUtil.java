/**
 * Copyright &copy; 2012-2013 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.nodexy.woostore.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil  {
	
	private static SimpleDateFormat simFormat = new SimpleDateFormat("ddMMyyyyHHmmss");

	public static Date parseDate(String dateStr) throws ParseException{
		Date date = simFormat.parse(dateStr);
		return date ;
	}
	public static Date parseDate(String dateStr,TimeZone tieZone) throws ParseException{
		simFormat.setTimeZone(tieZone);
		Date date = simFormat.parse(dateStr); // FIXME  
		// XXX 
		// TODO  转换到指定时区
		return date ;
	}
	public static long currentTimeStamp(){
		return System.currentTimeMillis()/1000;
	}
	public static long parseTimeStamp(Date date){
		return date.getTime()/1000;
	}
	public static long parseTimeStamp(long dateTime){
		return dateTime/1000;
	}
	public static void main(String[] args) throws ParseException {
		System.out.println(parseTimeStamp(parseDate("12042014101930", TimeZone.getTimeZone("GMT"))));
	}
}
