package com.example;
/**
 * 被观察者的接口
 * @author Still2Almost
 *
 */
public interface Observable {
	//增加一个观察者
	public void addObservable(Observer observer);
	//删除一个观察者
	public void deleteObservable(Observer observer);
	//既然要观察，我发生了什么他也应该有动作，通知观察这
	public void notifObservers(String context);
}
