package com.constraintProxy;
/**
 * 强制代理的场景类
 * @author Long
 *
 */
public class ClientTrueProxy {
	public static void main(String[] args) {
		IGamePlayer gamePlayer=new GamePlayer("张三");
		//指定获得指定代理
		IGamePlayer gamePlayerProxy=gamePlayer.getProxy();
		gamePlayerProxy.login("zhangsan", "password");
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
	}
}
