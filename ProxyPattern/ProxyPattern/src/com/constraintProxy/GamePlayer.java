package com.constraintProxy;

public class GamePlayer implements IGamePlayer{
	private String name="";
	//我的代理是谁
	private IGamePlayer proxy=null;
	public GamePlayer(String name){
		this.name=name;
	}
	//
	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		
	}
	//找到自己的代理
	@Override
	public IGamePlayer getProxy() {
		return null;
	}

}
