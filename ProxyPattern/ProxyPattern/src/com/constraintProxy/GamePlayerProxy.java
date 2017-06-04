package com.constraintProxy;
/**
 * ǿ�ƴ���Ĵ�����
 * @author Long
 *
 */
public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gameplay=null;
	//���캯�������û���
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
