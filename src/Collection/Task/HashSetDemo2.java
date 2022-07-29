package Collection.Task;

import java.util.*;

public class HashSetDemo2{
	public static void main(String[] args) {
		
		HashSet h = new HashSet();

		h.add("A");
		h.add("C");
		h.add("E");
		h.add("D");
		h.add("P");
		h.add(null);
		h.add(100);

		//Collections.sort(h);

		System.out.println(h.add("N"));
		System.out.println(h);
	}
}