package com.common;
/**
 * 具体的观察者
 * @author Still2Almost
 *
 */
public  class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("接收到具体的信息，然后开始处理");
	}
	
}
