package com.constraintProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientTrue {
	public static void main(String[] args) {
		IGamePlayer gamePlayer=
				new GamePlayer("张三");
		SimpleDateFormat sf=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("开始的时间："+sf.format(new Date()));
		gamePlayer.login("zhangsan", "pas");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
		System.out.println("结束的事件："+sf.format(new Date()));
	}
}
