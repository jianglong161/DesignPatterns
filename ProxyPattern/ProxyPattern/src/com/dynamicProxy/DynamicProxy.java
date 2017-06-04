package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import javax.print.attribute.standard.RequestingUserName;

public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader classLoader,
			Class<?>[]interfaces,InvocationHandler handler) {
		if (true) {
			(new BeforeAdvice()).exec();
		}
		return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
	}
	
	
}
