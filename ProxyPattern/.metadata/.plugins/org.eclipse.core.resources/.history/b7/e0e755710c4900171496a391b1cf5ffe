package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;

import javax.security.auth.Subject;

public class ClimetDy {
	public static void main(String[] args) {
		//定义一个主题
		Subect subect=new RealSubject();
		InvocationHandler invocationHandler=
				new MyInvocationHandler(subect);
		Subject proxy=DynamicProxy.newProxyInstance
				(subect.getClass().getClassLoader(), subect.getClass().getInterfaces(), invocationHandler);
		proxy.
	}
}
