package com.example;

public class UserInfo implements IUserInfo{

	@Override
	public String getUserName() {
		System.out.println("姓名叫做...");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("这是员工的家庭住址");
		return null;
	}

	@Override
	public String getMoileNumber() {
		System.out.println("这个人的手机电话是-00");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("办公室电话是....");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("这个人的职业是boss");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("员工的家庭电话");
		return null;
	}

}
