package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * ����˾����Ա��ʵ��
 * @author Still2Almost
 *
 */
public class OuterUser implements IOuterUser{
	/**
	 * �û��Ļ�����Ϣ
	 */
	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "���Ա����������ħ��");
		baseInfoMap.put("mobileNumber", "���Ա���绰��");
		return baseInfoMap;
	}
	/**
	 * Ա���Ĺ�����Ϣ������ְλ��
	 */
	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "����˵�ְλ��Boss������");
		officeInfo.put("officeTelNumber", "Ա���ļ�ͥ��ַ");
		return null;
	}
	
	/**
	 * Ա���ļ�ͥ��Ϣ
	 */
	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰�ǡ�����");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ������");
		
		return homeInfo;
	}

}