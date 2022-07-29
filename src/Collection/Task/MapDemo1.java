package Collection.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

class MapDemo1{
	public static void main(String[] args) {
		
		Map map = new HashMap();

		map.put(1,"Amit");
		map.put(5,"Mukesh");
		map.put(3,"Dhuv");	
		map.put(9,"Ankit");

		System.out.println(map);

		Iterator itr = map.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		// Set set = map.entrySet();
		// Iterator itr = set.iterator();

		// while(itr.hasNext()){
		// 	Map.Entry entry = (Map.Entry)itr.next();
		// 	System.out.println(entry.getKey()+" "+entry.getValue());
		// }
	}
}
