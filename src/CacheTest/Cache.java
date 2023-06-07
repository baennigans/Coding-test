package CacheTest;

import java.util.Arrays;
import java.util.Scanner;

public class Cache {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("캐시 크기 : ");
		int cache = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도시 입력(','로 구분) : ");
		String city = sc.nextLine();
		String citiToLower = city.toLowerCase();
		
		String[] cities = citiToLower.split(",");
		System.out.println(Arrays.toString(cities));
		
		CacheRuntime rt = new CacheRuntime(cache, cities);
		int runtime = rt.getRuntime();
		
		System.out.println("\n실행시간 : "+runtime);
	}
}
