package com.extend;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	//定义最多产生产生实例的数量
	private static int maxNumOfEmperor = 2;
	//每个皇帝都有名字，使用ArrayList来容纳，每个对象的实例方法
	private static ArrayList<String> nameList = new ArrayList<String>();
	//定义一个列表，容纳所有的皇帝实例
	private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
	//当前皇帝的索引号
	private static int countNumofEmperor = 0;
	//产生所有对象
	static{
		for(int i = 0; i< maxNumOfEmperor; i ++){
			emperorList.add(new Emperor("皇 " + (i+1) + "帝"));
		}
		
	}
	private Emperor(){
		//目的不产生第二个皇帝
	}
	//传入皇帝名称，建立一个皇帝对象
	private Emperor(String name){
		nameList.add(name);
	}
	//随机获得一个皇帝对象
	public static Emperor getInstance(){
		Random random = new Random();
		countNumofEmperor = random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumofEmperor);
	}
	//皇帝发话了
	public static void say(){
		System.out.println(nameList.get(countNumofEmperor));
	}
	
}
