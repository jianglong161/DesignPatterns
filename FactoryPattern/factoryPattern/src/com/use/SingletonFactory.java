package com.use;

import java.lang.reflect.Constructor;

import com.use.Singleton;
public class SingletonFactory {
	private static Singleton singleton;
	static{
		try{
			Class cl = Class.forName(Singleton.class.getName());
			//����޲ι���
			Constructor constructor = cl.getDeclaredConstructor();
			//�����޲ι����ǿɷ��ʵ�
			constructor.setAccessible(true);
			//����һ��ʵ������
			singleton = (Singleton) constructor.newInstance();
		}catch(Exception e){
			//�쳣����
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
}
