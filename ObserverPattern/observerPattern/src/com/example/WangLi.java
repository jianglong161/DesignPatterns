package com.example;

public class WangLi implements Observer{

	@Override
	public void update(String context) {
		System.out.println("王思观察到韩非子有活动，采取了措施");
		this.cry(context);
		System.out.println("王思哭了！！");
	}
	public void cry(String str){
		System.out.println("因为" + str + "就哭了");
	}

}
