package com.ensample;
/**
 * ���嶼�����ഴ������
 * @author Still2Almost
 *  ʹ���˷��ͣ�ͨ�����巺�Ͷ�createHuaman������������Ʋ������������ƣ�
 *  	������class����
 *  	������Human��ʵ����
 *  T��ʾ����ֻҪ��ʵ����Human�ӿڵ��඼������Ϊ������
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human > T createHuman(Class<T> c);
}
