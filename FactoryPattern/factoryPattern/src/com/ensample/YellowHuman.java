package com.ensample;
/**
 * 定义黄色人种
 * @author Still2Almost
 *
 */
public class YellowHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黄色人种的肌肤的颜色是黄色的");
	}

	@Override
	public void talk() {
		System.out.println("黄色人种会说话，一般都会说双字节");
	}

}
