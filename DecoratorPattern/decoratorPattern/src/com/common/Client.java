package com.common;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component = new ConreteDecorator1(component);
		//�ڶ�������
		component = new ConreteDecorator2(component);
		component.operate();
	}
}
