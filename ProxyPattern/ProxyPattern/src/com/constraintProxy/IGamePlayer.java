package com.constraintProxy;
/**
 * ǿ�ƴ����Ľӿ���
 * @author Long
 *
 */
public interface IGamePlayer {
	//��¼��Ϸ
	public void login(String username,String password);
	//ɱ��
	public void killBoss();
	//����
	public void upgrade();
	//ÿ���˶�һ����һ���Լ�����
	public IGamePlayer getProxy();
}