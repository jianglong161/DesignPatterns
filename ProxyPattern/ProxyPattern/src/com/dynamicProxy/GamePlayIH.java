package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 * @author Long
 *
 */
public class GamePlayIH implements InvocationHandler{
	//��������
	Class cls=null;
	//�������ʵ��
	Object obj=null;
	//��Ҫ����˭]\
	public GamePlayIH(Object obj){
		this.obj=obj;
	}
	//���ñ�����ķ���
	//��ɶ����Ƿ����ĵ���
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("���������ҵ��ʺ�");
		}
		return result;
	}

}
