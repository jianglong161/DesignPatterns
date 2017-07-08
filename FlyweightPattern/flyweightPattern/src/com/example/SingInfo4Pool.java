package com.example;
/**
 * 带对象池的报考信息
 * @authduior Still2Almost
 *	刚刚已经分析了所有的SignInfo对象都有一些共同的特性
 *  考试科目和考试地点
 *  把共性提取出作为所有对象的外部状态，
 *  在这个对象池中一个具体的外部状态只有一个对象
 *  定义key的值的标准为：
 *  考试科目+考试地点的复合字符串作为唯一的池对象标准
 */
public class SingInfo4Pool extends SingInfo{
	//定义一个对象池提取的key值
	private String key;
	//构造函数获得相同的标志
	public SingInfo4Pool(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
