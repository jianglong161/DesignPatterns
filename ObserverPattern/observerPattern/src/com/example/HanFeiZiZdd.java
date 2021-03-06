package com.example;

import java.util.ArrayList;

/**
 * 被观察这的是实现类，韩非子的加强版本
 * @author Still2Almost
 *
 */
public class HanFeiZiZdd implements IHanFeiZIi,Observable{
	//定义一个变长数据，存放所有的观察者
	private ArrayList<Observer> observrList = new ArrayList<Observer>();
	
	//增加观察者
	@Override
	public void addObservable(Observer observer) {
		this.observrList.add(observer);
	}
	//删除观察者
	public void deleteObservable(Observer observer) {
		this.observrList.remove(observer);
	}
	//通知所有的观察者
	public void notifObservers(String context) {
		for(Observer observer: observrList){
			observer.update(context);
		}
	}

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子开始吃饭了");
		//通知所有观察者
		this.notifObservers("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子开始娱乐了");
		this.notifObservers("韩非子在娱乐");
		
	}

}
