package BusTest;

import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ʋ ���� Ƚ�� : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��Ʋ ���� ���� : ");
		int t = sc.nextInt();
		sc.nextLine();
		
		System.out.print("��Ʋ ž�� ���� �� : ");
		int m = sc.nextInt();
		sc.nextLine();
		
		System.out.println("ũ�� ��⿭ ���� �ð�(','�� ����) :");
		String timetable1 = sc.nextLine();
		String timetable2 = timetable1.replace(":", "");
		
		
		
		System.out.println(n+" "+t+" "+m);
		System.out.println(timetable2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
