package com.example;
/**
 * ��߳ɼ�����
 * @author Long
 *
 */
public class HighScoreDecoreator extends Decorator{

	public HighScoreDecoreator(SchoolReport schoolReport) {
		super(schoolReport);
		// TODO Auto-generated constructor stub
	}
	//��Ҫ�㱨��߳ɼ�
	public void reprotHightScore(){
		System.out.println("��ο������������75 ������78 ��Ȼ��80");
	}
	@Override
	public void report(){
		this.reprotHightScore();
		super.report();
	}
}
