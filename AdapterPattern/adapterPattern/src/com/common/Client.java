package com.common;

public class Client {
	public static void main(String[] args) {
		//ԭ�е�ҵ���߼�
		Target target = new ConcreteTarget();
		target.request();
		//������������ɫ�Ժ���߼�
		
		Target target2 = new Adatper();
		target2.request();
	}
}
