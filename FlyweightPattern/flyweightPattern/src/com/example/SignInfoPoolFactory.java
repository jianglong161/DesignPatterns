package com.example;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 * @author Still2Almost
 *
 */
public class SignInfoPoolFactory {
	//池容器
	private static HashMap<String,SingInfo> pool =
			new HashMap<String,SingInfo>();
	//报名信息的对象工厂
	@Deprecated
	public static  SingInfo SingInfo(){
		return new SingInfo();
	}
	//从池中获得
	public static SingInfo getSingInfo(String key){
		//设置返回对象
		SingInfo result = null;
		if(!pool.containsKey(key)){
			System.out.println(key+ "-----建立对象并放到池中");
			result = new SingInfo4Pool(key);
			pool.put(key, result);
		}else {
			result = pool.get(key);
			System.out.println(key+ "-----从池中直接获得");
		}
		return result;
	}
}
