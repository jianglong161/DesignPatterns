package com.example;
/**
 * 具体被观察者
 * 对接口进行补充，增加个两个状态，是否在吃早饭，是否在娱乐
 * @author Still2Almost
 *
 */
public class HanFeiZi implements IHanFeiZIi{
	//韩非子是否在吃早饭
	private boolean isHavingBreakfast = false;
	//韩非子是否在娱乐
	private boolean isHavingFun = false;
	//韩非子要是早饭了
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子，开始吃早饭。。。");
		this.isHavingBreakfast = true;
	}
	//韩非子要吃娱乐
	@Override
	public void haveFun() {
		System.out.println("韩非子：要吃早饭了");
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
