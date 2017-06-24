package com.example;
/**
 * 一旦自己观察的对象发生了变化，自己立刻要行动起来
 * @author Still2Almost
 *
 */
public class Lisi implements ILisi{
	//首先李斯是个观察者，一旦韩非子有活动，他就直到，他就要向老板报告
	@Override
	public void update(String context) {
		System.out.println("李斯：观测到韩非的活动，开始向老板报告");
		this.reportToinshihuang(context);
		System.out.println("李斯：报告完毕");
	}
	//汇报给秦始皇
	private void reportToinshihuang(String reportContext){
		System.out.println("李斯:报告老板，韩非子有活动了------->"
				+ reportContext);
	}

}
