package com.example;
/**
 * ���屻�۲���
 * �Խӿڽ��в��䣬���Ӹ�����״̬���Ƿ��ڳ��緹���Ƿ�������
 * @author Still2Almost
 *
 */
public class HanFeiZi implements IHanFeiZIi{
	//�������Ƿ��ڳ��緹
	private boolean isHavingBreakfast = false;
	//�������Ƿ�������
	private boolean isHavingFun = false;
	//������Ҫ���緹��
	@Override
	public void haveBreakfast() {
		System.out.println("�����ӣ���ʼ���緹������");
		this.isHavingBreakfast = true;
	}
	//������Ҫ������
	@Override
	public void haveFun() {
		System.out.println("�����ӣ�Ҫ���緹��");
		this.isHavingFun = true;
	}
	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}
	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}
	public boolean isHavingFun() {
		return isHavingFun;
	}
	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	

}
