package com.common;
/**
 * 抽象享元角色
 * @author Still2Almost
 *
 */
public abstract class Flyweight {
	//内部状态
	private String intrinsic;
	//外部状态
	protected final String Extrinsic;
	//要求享元角色必须接受外部状态
	public Flyweight(String Extrinsic) {
		this.Extrinsic = Extrinsic;
	}
	//定义业务操作
	public abstract void operate();
	//内部状体的get/set
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
}
