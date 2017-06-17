package com.common;
/**
 * 具体如何产生一个产品的对象
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
			// TODO: 异常处理
		}
		return (T) product;
	}

}
