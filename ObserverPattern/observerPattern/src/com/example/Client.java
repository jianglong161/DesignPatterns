package com.example;

public class Client {
	public static void main(String[] args) {
		//定义出韩非子和李斯
		HanFeiZiZdd hanFeiZi = new HanFeiZiZdd();
		WangLi wangLi = new WangLi();
		LisiAdd lisi = new LisiAdd();
		hanFeiZi.addObservable(wangLi);
		hanFeiZi.addObservable(lisi);
		//看看韩非子在干啥
		hanFeiZi.haveBreakfast();
		
	}
}
