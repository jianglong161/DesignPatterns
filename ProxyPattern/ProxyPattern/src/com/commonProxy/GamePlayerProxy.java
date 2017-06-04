package com.commonProxy;
/**
 * ���ȹ������캯����ʾ��˭�������
 * @author Long
 *
 */
public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer iGamePlayer;
	//ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy(String name ){
		try {
			iGamePlayer=new GamePlayer(this, name);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public GamePlayerProxy(IGamePlayer iGamePlayer){
		this.iGamePlayer=iGamePlayer;
	}
	
	//������¼
	@Override
	public void login(String usrr, String password) {
		iGamePlayer.login(usrr, password);
	}
	//����ɱ��
	@Override
	public void killBoss() {
		iGamePlayer.killBoss();
		
	}
	//��������
	@Override
	public void upgrade() {
		iGamePlayer.upgrade();
	}
}