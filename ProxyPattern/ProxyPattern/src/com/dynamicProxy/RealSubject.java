package com.dynamicProxy;

public class RealSubject implements Subect{

	@Override
	public void doSomething(String str) {
		System.out.println("��һЩ����---------->"+str);
	}

}
