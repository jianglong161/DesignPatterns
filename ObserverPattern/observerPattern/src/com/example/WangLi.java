package com.example;

public class WangLi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("��˼�۲쵽�������л����ȡ�˴�ʩ");
		this.cry(context);
		System.out.println("��˼���ˣ���");
	}
	public void cry(String str){
		System.out.println("��Ϊ" + str + "�Ϳ���");
	}

}
