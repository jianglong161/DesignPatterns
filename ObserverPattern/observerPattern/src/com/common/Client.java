package com.common;

public class Client {
	public static void main(String[] args) {
		//����һ�����۲���
		ConcreteSubject subject = new ConcreteSubject();
		//����һ���۲���
		ConcreteObserver observer = new ConcreteObserver();
		//�۲��߹۲챻�۲����
		subject.addObserver(observer);
		//�۲��߿�ʼ�
		subject.doSomeThing();
	}
}
