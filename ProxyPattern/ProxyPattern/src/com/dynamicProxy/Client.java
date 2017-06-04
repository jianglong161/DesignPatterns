package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.commonProxy.GamePlayer;
import com.commonProxy.IGamePlayer;

public class Client {
	public static void main(String[] args) {
		//����һ���������
		IGamePlayer gamePlayer=new GamePlayer("����");
		//����һ��������
		InvocationHandler invocationHandler=
				new GamePlayIH(gamePlayer);
		//������Class loader
		ClassLoader classLoader=
				gamePlayer.getClass().getClassLoader();
		//��̬����һ��������
		IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance
				(classLoader, new Class[]{IGamePlayer.class}, invocationHandler);
		proxy.login("login", "sss");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
