package com.ensample;
/**
 * 定义黑色人种
 * @author Still2Almost
 *
 */
public class BlackHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("黑色人种的颜色是黑色的");
	}

	@Override
	public void talk() {
		System.out.println("黑人说话，一般人听不懂");
	}

}
