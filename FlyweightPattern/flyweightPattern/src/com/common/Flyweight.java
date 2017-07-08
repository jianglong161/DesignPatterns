package com.common;
/**
 * ������Ԫ��ɫ
 * @author Still2Almost
 *
 */
public abstract class Flyweight {
	//�ڲ�״̬
	private String intrinsic;
	//�ⲿ״̬
	protected final String Extrinsic;
	//Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String Extrinsic) {
		this.Extrinsic = Extrinsic;
	}
	//����ҵ�����
	public abstract void operate();
	//�ڲ�״���get/set
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
}
