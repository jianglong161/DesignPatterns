package com.common;

import java.util.HashMap;

/**
 * 享元工厂
 * @author Still2Almost
 *
 */
public class FlyweightFactory {
	//定义池容器
	private static HashMap<String,Flyweight> pool =
			new HashMap<String,Flyweight>();
	//享元工厂
	public static Flyweight getFlyweight(String Extrinsic){
		//需要返回的对象
		Flyweight result = null;
		//在池中没有对象
		if(!pool.containsKey(Extrinsic)){
			result = new ConcreteFlyweight(Extrinsic);
			pool.put(Extrinsic, result);
			
		}else {
			
			pool.get(Extrinsic);
		}
		return result;
	}
}
