package com.example;
/**
 * 最高成绩修饰
 * @author Long
 *
 */
public class HighScoreDecoreator extends Decorator{

	public HighScoreDecoreator(SchoolReport schoolReport) {
		super(schoolReport);
		// TODO Auto-generated constructor stub
	}
	//我要汇报最高成绩
	public void reprotHightScore(){
		System.out.println("这次考试最高是语文75 数序是78 自然是80");
	}
	@Override
	public void report(){
		this.reprotHightScore();
		super.report();
	}
}
