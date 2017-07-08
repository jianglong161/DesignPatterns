package com.common;
/**
 * �����װ����
 * @author Long
 *
 */
public class ConreteDecorator1 extends Decorator{

	public ConreteDecorator1(Component component) {
		super(component);
	}
	//�����Լ������η���
	public void method(){
		System.out.println("method1 ����");
	}
	//��д�����Opreation
	@Override
	public void operate(){
		this.method();
		super.operate();
	}
}