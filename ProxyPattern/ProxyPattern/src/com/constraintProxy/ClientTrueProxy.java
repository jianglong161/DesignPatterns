package com.constraintProxy;
/**
 * ǿ�ƴ���ĳ�����
 * @author Long
 *
 */
public class ClientTrueProxy {
	public static void main(String[] args) {
		IGamePlayer gamePlayer=new GamePlayer("����");
		//ָ�����ָ������
		IGamePlayer gamePlayerProxy=gamePlayer.getProxy();
		gamePlayerProxy.login("zhangsan", "password");
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
	}
}
