package com.example;
/**
 * һ���Լ��۲�Ķ������˱仯���Լ�����Ҫ�ж�����
 * @author Still2Almost
 *
 */
public class Lisi implements ILisi{
	//������˹�Ǹ��۲��ߣ�һ���������л������ֱ��������Ҫ���ϰ屨��
	@Override
	public void update(String context) {
		System.out.println("��˹���۲⵽���ǵĻ����ʼ���ϰ屨��");
		this.reportToinshihuang(context);
		System.out.println("��˹���������");
	}
	//�㱨����ʼ��
	private void reportToinshihuang(String reportContext){
		System.out.println("��˹:�����ϰ壬�������л��------->"
				+ reportContext);
	}

}
