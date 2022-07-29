package Collection;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class MapTest1{
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();

		map.put("Myname", "Prakash");
		map.put("actor", "Akriti");
		map.put("CEO", "Pruthviraj");
		map.put("BVN", "Chetan");

		Set<String> keys = map.keySet();

		for (String key : keys ) {
			System.out.println(key+" "+map.get(key));	
		}
	}
}