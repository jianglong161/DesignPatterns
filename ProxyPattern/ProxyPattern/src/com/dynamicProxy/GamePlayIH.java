package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @author Long
 *
 */
public class GamePlayIH implements InvocationHandler{
	//被代理类
	Class cls=null;
	//被代理的实例
	Object obj=null;
	//我要代理谁]\
	public GamePlayIH(Object obj){
		this.obj=obj;
	}
	//调用被代理的方法
	//完成对真是方法的调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("有人在用我的帐号");
		}
		return result;
	}

}
