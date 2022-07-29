package Collection.Task;

import java.util.*;

class MapExample2{
	public static void main(String[] args) {
		
		//Map<Integer, String> map =new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> link = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> inte = new TreeMap<Integer, String>();

		inte.put(1,"Amit");
		inte.put(4,"Mohit");
		inte.put(2,"Niketan");
		inte.put(5,"Bhavesh");
		inte.put(6,"Parth");
		inte.put(9,"zartaz");
		inte.put(4,"Monika");
		inte.put(3,"vipul");
		inte.put(2,"Chintan");

		for (Map.Entry m : inte.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}