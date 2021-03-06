package com.commonProxy;

public class GamePlayer implements IGamePlayer{
	private String name="";
	//构造函数限制谁能常见对象，并同时传递姓名{}
	public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception{
		if (gamePlayer==null) {
			throw new Exception("不能创建角色");
		}else {
			this.name=name;
		}
	}
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
