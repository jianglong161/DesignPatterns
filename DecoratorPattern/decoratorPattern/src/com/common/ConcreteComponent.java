package com.common;
/**
 * 具体构件
 * @author Long
 *
 */
public class ConcreteComponent extends Component{
	//具体实现
	@Override
	public void operate() {
		System.out.println("do SomeThing");
	}

}
