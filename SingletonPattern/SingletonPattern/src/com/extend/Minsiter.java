package com.extend;

public class Minsiter {
	public static void main(String[] args) {
		 //定义5个大臣
		int minnisterNum = 5;
		for(int i = 0; i < minnisterNum; i++){
			Emperor emperor = Emperor.getInstance();
			System.out.println("第 " + (i + 1) +"个大臣惨败的是");
			emperor.say();
		}
	}
}
