package com.common;

import java.util.Vector;

/**
 * 被观察者
 * @author Still2Almost
 *
 */
public abstract class Subject {
	//定义一个观察这数据
	private Vector<Observer> obsVector = new Vector<Observer>();
	//增加一个观察者
	public void addObserver(Observer observer){
		this.obsVector.add(observer);
	}
	//删除一个观察者
	public void delObserver(Observer observer){
		this.obsVector.remove(observer);
	}
	//通知所有的观察者
	public void notifyObserver(){
		for(Observer observer : obsVector){
			observer.update();
		}
	}
}
