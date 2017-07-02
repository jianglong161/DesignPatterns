package com.example;

public class SortDecoreator extends Decorator{

	public SortDecoreator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	public void reportSort(){
		System.out.println("我的排名是第38名");
	}
	@Override
	public void report(){
		super.report();
		this.reportSort();
	}
}
