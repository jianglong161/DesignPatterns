package com.commonProxy;

public class GamePlayer implements IGamePlayer{
	private String name="";
	//���캯������˭�ܳ������󣬲�ͬʱ��������{}
	public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception{
		if (gamePlayer==null) {
			throw new Exception("���ܴ�����ɫ");
		}else {
			this.name=name;
		}
	}
//	public GamePlayer(String _name){
//		this.name=_name;
//	}
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