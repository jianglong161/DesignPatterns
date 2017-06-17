package com.ensample;
/**
 * ���ഴ������
 * @author Still2Almost
 *
 */
public class HumanFactory extends AbstractHumanFactory{

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		//����һ����������
		Human human = null;
		try {
			//����һ������
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("�������ɴ���");
		}
		return (T) human;
	}

}