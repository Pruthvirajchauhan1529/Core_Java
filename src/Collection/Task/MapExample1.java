package Collection.Task;

import java.util.Map;
import java.util.HashMap;
import java.util.*;

class MapExample1{
	public static void main(String[] args) {
		HashMap map = new HashMap();


		map.put(1,"Amit");
		map.put(4,"Mohit");
		map.put(2,"Niketan");
		map.put(5,"Bhavesh");
		map.put(6,"Parth");
/*
		Set<Map.Entry> maps = map.entrySet();
		for (Map.Entry m : map ) {
			System.out.println(m.getKey()+" "+m.getValue());
		}*/

		System.out.println(map);
	}
}