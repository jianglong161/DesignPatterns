package com.expale;

public class GamePlayer implements IGamePlayer{
	private String name="";
	public GamePlayer(String _name){
		this.name=_name;
	}
	@Override
	public void login(String usrr, String password) {
		System.out.println("��¼����"+usrr+"���û�"+this.name+"��¼�ɹ�");
	}
	@Override
	public void killBoss() {
		System.out.println(this.name+" �ڴ��");
	}
	@Override
	public void upgrade() {
		System.out.println(this.name+" ������һ��");
	}
}
