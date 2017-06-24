package com.common;

import java.util.Vector;

/**
 * ���۲���
 * @author Still2Almost
 *
 */
public abstract class Subject {
	//����һ���۲�������
	private Vector<Observer> obsVector = new Vector<Observer>();
	//����һ���۲���
	public void addObserver(Observer observer){
		this.obsVector.add(observer);
	}
	//ɾ��һ���۲���
	public void delObserver(Observer observer){
		this.obsVector.remove(observer);
	}
	//֪ͨ���еĹ۲���
	public void notifyObserver(){
		for(Observer observer : obsVector){
			observer.update();
		}
	}
}
