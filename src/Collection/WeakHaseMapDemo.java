package Collection;

import java.util.WeakHashMap;
import java.util.Map;


public class WeakHaseMapDemo{
	public static void main(String[] args) throws InterruptedException {
		
		Map<User, String> map = new WeakHashMap<>();

		User u = new User();
		map.put(u,"Tom");

		System.out.println(map);

		u = null;
		System.gc();
		Thread.sleep(5000);

		System.out.println(map);
	}
}