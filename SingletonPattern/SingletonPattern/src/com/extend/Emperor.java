package com.extend;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	//��������������ʵ��������
	private static int maxNumOfEmperor = 2;
	//ÿ���ʵ۶������֣�ʹ��ArrayList�����ɣ�ÿ�������ʵ������
	private static ArrayList<String> nameList = new ArrayList<String>();
	//����һ���б����������еĻʵ�ʵ��
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	//��ǰ�ʵ۵�������
	private static int countNumofEmperor = 0;
	//�������ж���
	static{
		for(int i = 0; i< maxNumOfEmperor; i ++){
			emperorList.add(new Emperor("�� " + (i+1) + "��"));
		}
		
	}
	private Emperor(){
		//Ŀ�Ĳ������ڶ����ʵ�
	}
	//����ʵ����ƣ�����һ���ʵ۶���
	private Emperor(String name){
		nameList.add(name);
	}
	//������һ���ʵ۶���
	public static Emperor getInstance(){
		Random random = new Random();
		countNumofEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumofEmperor);
	}
	//�ʵ۷�����
	public static void say(){
		System.out.println(nameList.get(countNumofEmperor));
	}
	
}