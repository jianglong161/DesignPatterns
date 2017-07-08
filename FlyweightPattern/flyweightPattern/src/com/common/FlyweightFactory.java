package com.common;

import java.util.HashMap;

/**
 * ��Ԫ����
 * @author Still2Almost
 *
 */
public class FlyweightFactory {
	//���������
	private static HashMap<String,Flyweight> pool =
			new HashMap<String,Flyweight>();
	//��Ԫ����
	public static Flyweight getFlyweight(String Extrinsic){
		//��Ҫ���صĶ���
		Flyweight result = null;
		//�ڳ���û�ж���
		if(!pool.containsKey(Extrinsic)){
			result = new ConcreteFlyweight(Extrinsic);
			pool.put(Extrinsic, result);
			
		}else {
			
			pool.get(Extrinsic);
		}
		return result;
	}
}