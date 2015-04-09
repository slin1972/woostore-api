package com.woo.server.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestAttribute {
	/**
	 * The request attribute to bind to .
	 * @return
	 */
	String value() default "";
	
	boolean required() default false;
	
	String defaultValue() default "";
}
