package com.common;
/**
 * ���󹤳���
 * @author Still2Almost
 *
 */
public abstract class Creator {
	/**
	 * ����һ����Ʒ����������Ĳ���������������
	 * ͨ��ΪString��Enum��Class�ȣ�Ҳ����Ϊ��
	 */
	public abstract <T extends Product> T creator(Class<T> c);
}
