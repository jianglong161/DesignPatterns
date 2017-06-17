package com.ensample;
/**
 * 定义都想人类创建工厂
 * @author Still2Almost
 *  使用了泛型，通过定义泛型对createHuaman输入参数的限制产生里两层限制：
 *  	必须是class类型
 *  	必须是Human的实现类
 *  T表示的是只要是实现了Human接口的类都可以作为参数，
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human > T createHuman(Class<T> c);
}
