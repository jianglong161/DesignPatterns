package com.common;
/**
 * 具体享元角色
 * @author Still2Almost
 *
 */
public class ConcreteFlyweight extends Flyweight{
	//接受外部状态
	public ConcreteFlyweight(String Extrinsic) {
		super(Extrinsic);
	}
	//根据外部状态进行逻辑处理
	public void operate(){
		//业务处理
	}
}
