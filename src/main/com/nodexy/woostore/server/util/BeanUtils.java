package com.nodexy.woostore.server.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.FatalBeanException;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

public class BeanUtils {
	public static void copyProperties(Object source,Object target,Boolean ignoreNullProperties,String... ignoreProperties){
		
		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

		Class<?> actualEditable = target.getClass();
		
		PropertyDescriptor[] targetPds = org.springframework.beans.BeanUtils.getPropertyDescriptors(actualEditable);
		List<String> ignoreList = (ignoreProperties != null) ? Arrays.asList(ignoreProperties) : null;

		for (PropertyDescriptor targetPd : targetPds) {
			Method writeMethod = targetPd.getWriteMethod();
			if (writeMethod != null && (ignoreProperties == null || (!ignoreList.contains(targetPd.getName())))) {
				PropertyDescriptor sourcePd = org.springframework.beans.BeanUtils.getPropertyDescriptor(source.getClass(), targetPd.getName());
				if (sourcePd != null) {
					Method readMethod = sourcePd.getReadMethod();
					if (readMethod != null &&
							ClassUtils.isAssignable(writeMethod.getParameterTypes()[0], readMethod.getReturnType())) {
						try {
							if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
								readMethod.setAccessible(true);
							}
							Object value = readMethod.invoke(source);
							if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
								writeMethod.setAccessible(true);
							}
							if(value != null || !ignoreNullProperties){
								writeMethod.invoke(target, value);
							}
						}
						catch (Throwable ex) {
							throw new FatalBeanException(
									"Could not copy property '" + targetPd.getName() + "' from source to target", ex);
						}
					}
				}
			}
		}
	}

	public static void copyProperties(Object source,Object target) {
		copyProperties(source, target,true,(String[]) null);	
	}
}
