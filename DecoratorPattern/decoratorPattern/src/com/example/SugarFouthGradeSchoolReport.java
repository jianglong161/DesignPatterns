package com.example;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{
	//���ȶ�����Ҫ�����ķ���
	public void reportHighScore(){
		System.out.println("��ο���������ߵ���75����ѧ78����Ȼ��80");
		
	}
	//���ϰֿ���ɼ��������ڻز�ѧУ���������
	public void reprotSort(){
		System.out.println("�ҵ�������38��");
		
	}
	//���ڻ㱨����ͬ�Ѿ������Ҫ��д����
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
		this.reprotSort();
	}
}
