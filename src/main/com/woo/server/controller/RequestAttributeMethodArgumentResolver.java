package com.woo.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class RequestAttributeMethodArgumentResolver implements HandlerMethodArgumentResolver{

	@Override
	public Object resolveArgument(MethodParameter parameter,
			ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
			WebDataBinderFactory binderFactory) throws Exception {
		RequestAttribute ann = parameter.getParameterAnnotation(RequestAttribute.class);
		String name = ann.value();
		if(name == null){
			name = parameter.getParameterName();
		}
		HttpServletRequest request = (HttpServletRequest)webRequest.getNativeRequest();
		Object value = request.getAttribute(name);
		
		if(value == null && ann.required()){
			//不能为空
			throw new MissingServletRequestParameterException(name, parameter.getParameterType().getSimpleName());
		}
		if(value == null && !StringUtils.isEmpty(ann.defaultValue())){
			value = ann.defaultValue();
		}
		return value ;
	}

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		RequestAttribute ann = parameter.getParameterAnnotation(RequestAttribute.class);
		return ann != null;
	}
}
