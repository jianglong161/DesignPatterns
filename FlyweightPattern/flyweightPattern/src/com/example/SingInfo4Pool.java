package com.example;
/**
 * ������صı�����Ϣ
 * @authduior Still2Almost
 *	�ո��Ѿ����������е�SignInfo������һЩ��ͬ������
 *  ���Կ�Ŀ�Ϳ��Եص�
 *  �ѹ�����ȡ����Ϊ���ж�����ⲿ״̬��
 *  ������������һ��������ⲿ״ֻ̬��һ������
 *  ����key��ֵ�ı�׼Ϊ��
 *  ���Կ�Ŀ+���Եص�ĸ����ַ�����ΪΨһ�ĳض����׼
 */
public class SingInfo4Pool extends SingInfo{
	//����һ���������ȡ��keyֵ
	private String key;
	//���캯�������ͬ�ı�־
	public SingInfo4Pool(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
