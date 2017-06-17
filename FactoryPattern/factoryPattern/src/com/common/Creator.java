package com.common;
/**
 * 抽象工厂类
 * @author Still2Almost
 *
 */
public abstract class Creator {
	/**
	 * 创建一个产品对象，其输入的参数可以自行设置
	 * 通常为String，Enum，Class等，也可以为空
	 */
	public abstract <T extends Product> T creator(Class<T> c);
}
