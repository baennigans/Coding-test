package MapTest;

import java.util.Scanner;

public class map01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		String[] arr3 = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arr1 의 "+(i+1)+"번째 숫자를 입력하세요 : ");
			arr1[i]= sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("---------------------------------------------");
		
		
		for(int i=0; i<n; i++) {
			System.out.print("arr2 의 "+(i+1)+"번째 숫자를 입력하세요 : ");
			arr2[i]= sc.nextInt();
			sc.nextLine();
		}
		
		
		for(int i=0; i<n; i++) {
			int bit = arr1[i] | arr2[i];
			arr3[i] = Integer.toBinaryString(bit);
	        arr3[i] = arr3[i].replace('1', '#');
	        arr3[i] = arr3[i].replace('0', ' ');
	        System.out.println(arr3[i]);
		}
		
		
	}
}
