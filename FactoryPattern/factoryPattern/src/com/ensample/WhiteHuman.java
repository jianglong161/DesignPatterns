package com.ensample;
/**
 * �����ɫ����
 * @author Still2Almost
 *
 */
public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵļ�������ɫ�ǰ�ɫ��");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼��˵���ֽ�");
	}

}