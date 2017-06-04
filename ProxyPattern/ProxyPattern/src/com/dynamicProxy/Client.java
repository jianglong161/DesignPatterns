package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.commonProxy.GamePlayer;
import com.commonProxy.IGamePlayer;

public class Client {
	public static void main(String[] args) {
		//定义一个痴迷玩家
		IGamePlayer gamePlayer=new GamePlayer("张三");
		//定义一个处理器
		InvocationHandler invocationHandler=
				new GamePlayIH(gamePlayer);
		//获得类的Class loader
		ClassLoader classLoader=
				gamePlayer.getClass().getClassLoader();
		//动态产生一个代理者
		IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance
				(classLoader, new Class[]{IGamePlayer.class}, invocationHandler);
		proxy.login("login", "sss");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
