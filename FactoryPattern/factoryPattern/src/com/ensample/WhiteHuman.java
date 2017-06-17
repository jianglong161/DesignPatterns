package com.ensample;
/**
 * 定义白色人种
 * @author Still2Almost
 *
 */
public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("白色人种的肌肤的颜色是白色的");
	}

	@Override
	public void talk() {
		System.out.println("白色人种会说话，一般都会说单字节");
	}

}
