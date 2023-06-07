package DartTest;

import java.util.Scanner;

public class DartApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("다트 결과 : ");
		String dartResult = sc.nextLine();
		
		DartResultAnalyzer ra = new DartResultAnalyzer(dartResult);
		int dartScore = ra.getDartScore();
		String dartScoreEquation = ra.getDartScoreEquation();
		
		System.out.printf("\nscore : %s \t equation : %s", dartScore, dartScoreEquation);
	}
	
}