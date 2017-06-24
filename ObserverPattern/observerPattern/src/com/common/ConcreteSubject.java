package com.common;
/**
 * 具体的被观察者
 * @author Still2Almost
 *
 */
public class ConcreteSubject extends Subject{
	//具体的业务
	public void doSomeThing(){
		/**
		 * do something
		 */
		super.notifyObserver();
	}
}
