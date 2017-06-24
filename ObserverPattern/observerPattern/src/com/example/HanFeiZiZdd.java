package com.example;

import java.util.ArrayList;

/**
 * ���۲������ʵ���࣬�����ӵļ�ǿ�汾
 * @author Still2Almost
 *
 */
public class HanFeiZiZdd implements IHanFeiZIi,Observable{
	//����һ���䳤���ݣ�������еĹ۲���
	private ArrayList<Observer> observrList = new ArrayList<Observer>();
	
	//���ӹ۲���
	@Override
	public void addObservable(Observer observer) {
		this.observrList.add(observer);
	}
	//ɾ���۲���
	public void deleteObservable(Observer observer) {
		this.observrList.remove(observer);
	}
	//֪ͨ���еĹ۲���
	public void notifObservers(String context) {
		for(Observer observer: observrList){
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("�����ӿ�ʼ�Է���");
		//֪ͨ���й۲���
		this.notifObservers("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("�����ӿ�ʼ������");
		this.notifObservers("������������");
		
	}

}