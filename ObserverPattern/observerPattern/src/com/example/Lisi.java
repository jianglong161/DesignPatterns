package com.example;
/**
 * һ���Լ��۲�Ķ������˱仯���Լ�����Ҫ�ж�����
 * @author Still2Almost
 *
 */
public class Lisi implements ILisi{
	//������˹�Ǹ��۲��ߣ�һ���������л������ֱ��������Ҫ���ϰ屨��
	@Override
	public void update(String context) {
		System.out.println("��˹���۲⵽���ǵĻ����ʼ���ϰ屨��");
		this.reportToinshihuang(context);
		System.out.println("��˹���������");
	}
	//�㱨����ʼ��
	private void reportToinshihuang(String reportContext){
		System.out.println("��˹:�����ϰ壬�������л��------->"
				+ reportContext);
	}

}
//���
class Spy extends Thread{
	private HanFeiZi hanFeiZi;
	private Lisi lisi;
	private String type;
	//ͨ�����캯�����ݲ�������Ҫ��ص���˭��˭Ҫ��أ�Ҫ���ʲô
	public Spy(HanFeiZi hanFeiZi, Lisi lisi, String type) {
		this.hanFeiZi = hanFeiZi;
		this.lisi = lisi;
		this.type = type;
	}
	@Override
	public void run(){
		while (true) {
			//����Ƿ����ڳ��緹
			if(this.type.equals("break")){
				//������ֺ������ڳ��緹����֪ͨ��˹
				if(this.hanFeiZi.isHavingBreakfast()){
					this.lisi.update("�������ڳ��緹");
					//����״̬
					this.hanFeiZi.setHavingBreakfast(false);
				}else{
					//�����������
					if(this.hanFeiZi.isHavingFun()){
						this.lisi.update("������������");
						//����״̬
						this.hanFeiZi.setHavingFun(false);
					}
				}
			}
		}
	}
}