package com.example;
/**
 * �ʵ���
 * @author Long
 *
 */
public class Emperor {
	//��ʼ��һ���ʵ�
	private static final Emperor emperor = new Emperor();
	private  Emperor() {
		//���׺͵��µ�Լ����Ŀ���ǲ�ϣ�������ڶ����ʵ�
	}
	public static Emperor getInstance(){
		return emperor;
	}
	//�ʵ۷���
	public static void say(){
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ");
	}
}
