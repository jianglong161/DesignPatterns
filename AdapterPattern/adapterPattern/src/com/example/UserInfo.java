package com.example;

public class UserInfo implements IUserInfo{

	@Override
	public String getUserName() {
		System.out.println("��������...");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("����Ա���ļ�ͥסַ");
		return null;
	}

	@Override
	public String getMoileNumber() {
		System.out.println("����˵��ֻ��绰��-00");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("�칫�ҵ绰��....");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("����˵�ְҵ��boss");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("Ա���ļ�ͥ�绰");
		return null;
	}

}
