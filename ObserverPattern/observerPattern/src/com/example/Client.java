package com.example;

public class Client {
	public static void main(String[] args) {
		//����������Ӻ���˹
		HanFeiZiZdd hanFeiZi = new HanFeiZiZdd();
		WangLi wangLi = new WangLi();
		LisiAdd lisi = new LisiAdd();
		hanFeiZi.addObservable(wangLi);
		hanFeiZi.addObservable(lisi);
		//�����������ڸ�ɶ
		hanFeiZi.haveBreakfast();
		
	}
}