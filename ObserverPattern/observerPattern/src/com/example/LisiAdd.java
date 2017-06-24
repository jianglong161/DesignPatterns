package com.example;
/**
 * 具体的观察者
 * @author Still2Almost
 *
 */
public class LisiAdd implements Observer{

	@Override
	public void update(String context) {
		System.out.println("李斯：观察到韩非子有情况，他就要向老板汇报");
		this.reportToinshihuang(context);
		System.out.println("李斯：汇报完毕");
	}
	private void reportToinshihuang(String reportContext){
		System.out.println("李斯:报告老板，韩非子有活动了------->"
				+ reportContext);
	}

}
