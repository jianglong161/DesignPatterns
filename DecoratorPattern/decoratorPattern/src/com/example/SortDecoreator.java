package com.example;

public class SortDecoreator extends Decorator{

	public SortDecoreator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	public void reportSort(){
		System.out.println("�ҵ������ǵ�38��");
	}
	@Override
	public void report(){
		super.report();
		this.reportSort();
	}
}
