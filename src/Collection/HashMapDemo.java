package Collection;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class HashMapDemo{
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();

		map.put("John",70);
		map.put("Priya",60);
		map.put("Ravi",90);
		map.put("Jiya",80);

		Set<String> keySet = map.keySet();
		System.out.println("Keys : "+keySet);

		Collection<Integer> values = map.values();
		System.out.println("Vslues : "+values);

		for (String key : keySet) {
			System.out.println("Key : "+key+" Value : "+map.get(key));
		}
	}
}