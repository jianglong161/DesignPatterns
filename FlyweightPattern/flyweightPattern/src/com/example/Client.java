package com.example;

public class Client {
	public static void main(String[] args) {
		//�ӹ������һ������
		//SingInfo singInfo = SignInfoFactory.getSingInfo();
		//��������ҵ����
		
		//��ʼ������
		for(int i=0;i<4;i++){
			String subject = "��Ŀ" + i;
			for(int j = 0 ;j < 30; j++){
				String key = subject + "���Եص�" + j;
				SignInfoPoolFactory.getSingInfo(key);
			}
		}
		
		SingInfo singInfo = SignInfoPoolFactory.getSingInfo("��Ŀ1���Եص�1");
	}
}