package com.ensample;
/**
 * ����Ů��࣬client
 * @author Still2Almost
 *
 */
public class NVWa {
	public static void main(String[] args) {
		//��������¯
		AbstractHumanFactory abstractHumanFactory =
				new HumanFactory();
		//Ů洵�һ�����˻�����쳵�˰���
		System.out.println("��һ��������ǰ���");
		Human whiteman = abstractHumanFactory.createHuman(WhiteHuman.class);
		whiteman.getColor();
		whiteman.talk();
		
		//����
		System.out.println("�ڶ����Ǻ���");
		Human blackman = abstractHumanFactory.createHuman(BlackHuman.class);
		blackman.getColor();
		blackman.talk();
		
		//��ɫ��
		System.out.println("�ڶ����ǻ�ɫ����");
		Human yellowman = abstractHumanFactory.createHuman(YellowHuman.class);
		yellowman.getColor();
		yellowman.talk();
	}
}