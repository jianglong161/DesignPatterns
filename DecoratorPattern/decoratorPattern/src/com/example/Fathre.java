package com.example;

public class Fathre {
	public static void main(String[] args) {
		SchoolReport schoolReport = new FouthGradeSchoolReport() ;
		//schoolReport = new HighScoreDecoreator(schoolReport);
		schoolReport = new SortDecoreator(schoolReport);
		schoolReport.report();
		schoolReport.sign("����");
	}
}
