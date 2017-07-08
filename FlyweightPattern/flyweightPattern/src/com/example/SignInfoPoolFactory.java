package com.example;

import java.util.HashMap;

/**
 * ������صĹ�����
 * @author Still2Almost
 *
 */
public class SignInfoPoolFactory {
	//������
	private static HashMap<String,SingInfo> pool =
			new HashMap<String,SingInfo>();
	//������Ϣ�Ķ��󹤳�
	@Deprecated
	public static  SingInfo SingInfo(){
		return new SingInfo();
	}
	//�ӳ��л��
	public static SingInfo getSingInfo(String key){
		//���÷��ض���
		SingInfo result = null;
		if(!pool.containsKey(key)){
			System.out.println(key+ "-----�������󲢷ŵ�����");
			result = new SingInfo4Pool(key);
			pool.put(key, result);
		}else {
			result = pool.get(key);
			System.out.println(key+ "-----�ӳ���ֱ�ӻ��");
		}
		return result;
	}
}