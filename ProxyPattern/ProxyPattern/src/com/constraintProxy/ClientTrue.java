package com.constraintProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientTrue {
	public static void main(String[] args) {
		IGamePlayer gamePlayer=
				new GamePlayer("����");
		SimpleDateFormat sf=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ʼ��ʱ�䣺"+sf.format(new Date()));
		gamePlayer.login("zhangsan", "pas");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
		System.out.println("�������¼���"+sf.format(new Date()));
	}
}
