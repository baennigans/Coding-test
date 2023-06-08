package BusTest;

import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("셔틀 운행 횟수 : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("셔틀 운행 간격 : ");
		int t = sc.nextInt();
		sc.nextLine();
		
		System.out.print("셔틀 탑승 가능 수 : ");
		int m = sc.nextInt();
		sc.nextLine();
		
		System.out.println("크루 대기열 도착 시각(','로 구분) :");
		String timetable1 = sc.nextLine();
		String timetable2 = timetable1.replace(":", "");
		
		
		
		System.out.println(n+" "+t+" "+m);
		System.out.println(timetable2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
