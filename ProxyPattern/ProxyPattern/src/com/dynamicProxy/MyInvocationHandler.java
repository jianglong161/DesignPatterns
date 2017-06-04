package com.dynamicProxy;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的处理类
 * @author Long
 *
 */
public class MyInvocationHandler implements InvocationHandler{
	private Object target=null;
	public MyInvocationHandler(Object object) {
		this.target=object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		return method.invoke(this.target, args);
	}

}
