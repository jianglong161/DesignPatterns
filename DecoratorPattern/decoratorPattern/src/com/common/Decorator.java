package com.common;
/**
 * ����װ����
 * @author Long
 *
 */
public abstract class Decorator extends Component{
	private Component component = null;
	//ͨ�����캯�����ݱ�������
	public Decorator(Component component) {
		this.component = component;
	}
	//ί�и���������ִ��
	@Override
	public void operate(){
		this.component.operate();
	}
}