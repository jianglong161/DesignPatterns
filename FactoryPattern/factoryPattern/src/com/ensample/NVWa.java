package com.ensample;
/**
 * 定义女娲类，client
 * @author Still2Almost
 *
 */
public class NVWa {
	public static void main(String[] args) {
		//声明八卦炉
		AbstractHumanFactory abstractHumanFactory =
				new HumanFactory();
		//女娲第一次造人火候不是造车了白人
		System.out.println("第一批创造的是白人");
		Human whiteman = abstractHumanFactory.createHuman(WhiteHuman.class);
		whiteman.getColor();
		whiteman.talk();
		
		//黑人
		System.out.println("第二批是黑人");
		Human blackman = abstractHumanFactory.createHuman(BlackHuman.class);
		blackman.getColor();
		blackman.talk();
		
		//黄色人
		System.out.println("第二批是黄色人种");
		Human yellowman = abstractHumanFactory.createHuman(YellowHuman.class);
		yellowman.getColor();
		yellowman.talk();
		
		//通过多工厂模式创
		System.out.println("多工厂模式");
		Human blackMan = (Human) new BlackHumanFactory().creatman();
		blackMan.getColor();
		blackMan.talk();
	}
}
