package com.example;
/**
 * ���εĳ�����
 * @author Long
 *
 */
public abstract class Decorator extends SchoolReport{
	//������Ҫ֪���ĸ��ɼ���
	private SchoolReport schoolReport;
	//���캯�������ݳɼ�������
	public Decorator(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	//�ɼ�������Ҫ��������
	public void report(){
		this.schoolReport.report();
	}
	//���껹��Ҫǩ����
	public void sign(String name){
		this.schoolReport.sign(name);
	}
}
