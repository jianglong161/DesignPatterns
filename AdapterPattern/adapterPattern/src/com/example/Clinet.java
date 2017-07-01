package com.example;

public class Clinet {
	public static void main(String[] args) {
		
		IUserInfo younggirl = new OuterUserInfo();
		for(int i = 0 ;i < 5; i++){
			younggirl.getMoileNumber();
		}
	}
}
