package Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class Comparators implements Comparator<String>{

	public int compare(String o1, String o2){
		int l1 = o1.length();
		int l2 = o2.length();
		if(l1<l2){
			return -1;
		}else if (l1>l2) {
			return 1;
		}else{
			return o1.compareTo(o2);
		}
	}
} 

public class StringComparatorDemo{
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new Comparators());

		set.add("abcxyzzdf");
		set.add("xyzfrds");
		set.add("pqrwgefdwef");
		set.add("efg");
		set.add("defzzzzzzzzzzzzzzz");

		for (String st : set) {
			System.out.println("Odering :- "+st);
		}
		
		//System.out.println(set);
	}
}