package com.common;
/**
 * ����ı��۲���
 * @author Still2Almost
 *
 */
public class ConcreteSubject extends Subject{
	//�����ҵ��
	public void doSomeThing(){
		/**
		 * do something
		 */
		super.notifyObserver();
	}
}
