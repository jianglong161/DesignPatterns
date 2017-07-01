package com.common;

public class Client {
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		//增加适配器角色以后的逻辑
		
		Target target2 = new Adatper();
		target2.request();
	}
}
