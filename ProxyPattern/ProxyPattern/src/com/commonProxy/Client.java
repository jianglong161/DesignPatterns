package com.commonProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ������
 * @author Long
 *
 */
public class Client {
	public static void main(String[] args) {
		//����һ�����Ե����
		//IGamePlayer gamePlayer=new GamePlayer("����");
		//������������
		IGamePlayer proxy=new GamePlayerProxy("����");
		//��ʼ����Ϸ��¼ʱ��
		SimpleDateFormat simpleDateFormat=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("��ǰʱ�䣺"+simpleDateFormat.format(new Date()));
		proxy.login("zhangsan", "password");
		//��ʼɱ��
		proxy.killBoss();
		//��ʼ����
		proxy.upgrade();
		//��¼����ʱ��
		System.out.println("����ʱ�䣺"+simpleDateFormat.format(new Date()));
		
	}
}