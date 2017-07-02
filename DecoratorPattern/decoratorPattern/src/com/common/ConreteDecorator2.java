package com.common;
/**
 * 具体的装饰类
 * @author Long
 *
 */
public class ConreteDecorator2 extends Decorator{

	public ConreteDecorator2(Component component) {
		super(component);
	}
	//定义自己的修饰方法
	public void method(){
		System.out.println("method2修饰");
	}
	//重写父类的Opreation
	@Override
	public void operate(){
		this.method();
		super.operate();
	}
}
