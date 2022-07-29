package Collection.Task;

import java.util.HashSet;

class DemoHashSet{
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("B");	
		h.add("A");	
		h.add("D");	
		h.add("C");	
		h.add("E");	
		h.add(null);	
		h.add(100);

		System.out.println(h);

	}
}