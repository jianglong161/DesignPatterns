package com.constraintProxy;
/**
 * 强制代理的代理类
 * @author Long
 *
 */
public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gameplay=null;
	//构造函数传递用户名
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gameplay=gamePlayer;
	}
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		this.gameplay.login(username, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gameplay.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gameplay.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return this;
	}

}
