package com.example;
/**
 * 四年级成绩单
 * @author Long
 *
 */
public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		System.out.println("尊敬的XXXX家长");
		System.out.println(".......");
		System.out.println("语文 63   数学 65 体育98 自然 63");
		System.out.println(".....");
		System.out.println("                  家长签字：");
	}

	public void sign(String name) {
		System.out.println("家长签名：" + name);
	}

	@Override
	public void sign() {
		// TODO Auto-generated method stub
		
	}

}
