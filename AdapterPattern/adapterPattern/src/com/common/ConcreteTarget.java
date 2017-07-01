package com.common;
/**
 * 目标角色的实现类
 * @author Still2Almost
 *
 */
public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("if you need any Help,pls call me");
		
	}
	
}
