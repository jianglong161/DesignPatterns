package com.example;
/**
 * ����Ĺ۲���
 * @author Still2Almost
 *
 */
public class LisiAdd implements Observer{

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�����������������Ҫ���ϰ�㱨");
		this.reportToinshihuang(context);
		System.out.println("��˹���㱨���");
	}
	private void reportToinshihuang(String reportContext){
		System.out.println("��˹:�����ϰ壬�������л��------->"
				+ reportContext);
	}

}
