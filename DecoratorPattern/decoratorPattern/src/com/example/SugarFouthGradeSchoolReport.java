package com.example;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{
	//首先定义你要美化的方法
	public void reportHighScore(){
		System.out.println("这次考试语文最高的是75，数学78，自然是80");
		
	}
	//在老爸看完成绩单后，我在回拨学校的排名情况
	public void reprotSort(){
		System.out.println("我的排名是38名");
		
	}
	//由于汇报的内同已经变更，要重写父类
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
		this.reprotSort();
	}
}
