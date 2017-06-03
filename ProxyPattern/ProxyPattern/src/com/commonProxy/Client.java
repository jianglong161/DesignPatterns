package com.commonProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 场景类
 * @author Long
 *
 */
public class Client {
	public static void main(String[] args) {
		//定义一个痴迷的玩家
		//IGamePlayer gamePlayer=new GamePlayer("张三");
		//定义故意代练者
		IGamePlayer proxy=new GamePlayerProxy("张三");
		//开始打游戏记录时间
		SimpleDateFormat simpleDateFormat=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间："+simpleDateFormat.format(new Date()));
		proxy.login("zhangsan", "password");
		//开始杀怪
		proxy.killBoss();
		//开始升级
		proxy.upgrade();
		//记录结束时间
		System.out.println("结束时间："+simpleDateFormat.format(new Date()));
		
	}
}
