package com.expale;

public class GamePlayer implements IGamePlayer{
	private String name="";
	public GamePlayer(String _name){
		this.name=_name;
	}
	@Override
	public void login(String usrr, String password) {
		System.out.println("登录名："+usrr+"的用户"+this.name+"登录成功");
	}
	@Override
	public void killBoss() {
		System.out.println(this.name+" 在打怪");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name+" 又生了一级");
	}
}
