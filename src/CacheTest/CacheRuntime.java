package CacheTest;

import java.util.ArrayList;
import java.util.List;

public class CacheRuntime {

	private int runtime;

	public CacheRuntime(int cache, String[] cities) {

		if (cache == 0) {
			runtime = 5 * cities.length;
			
		} else if (cache > 0 && cache <= 30) {
			List<String> cacheList = new ArrayList<>();

			for (int i = 0; i < cache; i++) {
				cacheList.add(cities[i]);
				runtime += 5;
			}

			for (int i = cache; i < cities.length; i++) {
				if (cacheList.contains(cities[i])) {
					cacheList.remove(cities[i]);
					cacheList.add(cities[i]);
					runtime += 1;
				} else {
					cacheList.remove(0);
					cacheList.add(cities[i]);
					runtime += 5;
				}
			}
			
		} else {
			System.out.println("캐시는 0~30 사이의 값 입니다.");
		}
	}

	
	public int getRuntime() {
		return runtime;
	}

}
