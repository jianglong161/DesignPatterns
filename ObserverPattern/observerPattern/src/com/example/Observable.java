package com.example;
/**
 * ���۲��ߵĽӿ�
 * @author Still2Almost
 *
 */
public interface Observable {
	//����һ���۲���
	public void addObservable(Observer observer);
	//ɾ��һ���۲���
	public void deleteObservable(Observer observer);
	//��ȻҪ�۲죬�ҷ�����ʲô��ҲӦ���ж�����֪ͨ�۲���
	public void notifObservers(String context);
}
