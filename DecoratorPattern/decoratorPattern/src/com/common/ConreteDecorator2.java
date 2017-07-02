package com.common;
/**
 * �����װ����
 * @author Long
 *
 */
public class ConreteDecorator2 extends Decorator{

	public ConreteDecorator2(Component component) {
		super(component);
	}
	//�����Լ������η���
	public void method(){
		System.out.println("method2����");
	}
	//��д�����Opreation
	@Override
	public void operate(){
		this.method();
		super.operate();
	}
}
