package com.common;
/**
 * ������β���һ����Ʒ�Ķ���
 * @author Still2Almost
 *
 */
public class ConcretrCreator extends Creator{

	@Override
	public <T extends Product> T creator(Class<T> c) {
		Product product = null;
		try{
			product = (Product) Class.forName(c.getName()).newInstance();
		}catch (Exception e) {
			// TODO: �쳣����
		}
		return (T) product;
	}

}
