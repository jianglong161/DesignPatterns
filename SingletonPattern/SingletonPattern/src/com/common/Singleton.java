package com.common;

public class Singleton {
	private static final Singleton singleton = new Singleton();
	//���Ʋ����������
	private Singleton(){
		
	}
	//ͨ���÷������ʵ������
	public static Singleton getInstance(){
		return singleton;
	}
	//���е���������,����ʹ��static
	public static void doSomething(){}
}
