package com.extend;

public class Minsiter {
	public static void main(String[] args) {
		 //����5����
		int minnisterNum = 5;
		for(int i = 0; i < minnisterNum; i++){
			Emperor emperor = Emperor.getInstance();
			System.out.println("�� " + (i + 1) +"���󳼲Ұܵ���");
			emperor.say();
		}
	}
}
