package com.common;

public class Client {
	public static void main(String[] args) {
		//���󹤳���   =  new  ������β���һ����Ʒ�Ķ���
		Creator creator = new ConcretrCreator();
		Product product = creator.creator(ConcreatorProduect1.class);
	}
}