package com.example;

public class Fathre {
	public static void main(String[] args) {
		SchoolReport schoolReport = null ;
		//schoolReport = new HighScoreDecoreator(schoolReport);
		schoolReport = new SortDecoreator(schoolReport);
		//schoolReport.report();
		schoolReport.sign("����");
	}
}
