package com.constraintProxy;
/**
 * 强制代理的接口类
 * @author Long
 *
 */
public interface IGamePlayer {
	//登录游戏
	public void login(String username,String password);
	//杀怪
	public void killBoss();
	//升级
	public void upgrade();
	//每个人都一颗找一下自己代理
	public IGamePlayer getProxy();
}
