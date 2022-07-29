package Collection.Task;

import java.util.TreeSet;
import java.util.Iterator;	
import java.util.*;

class TreeSetDemo2{
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();

		ts.add("Ravi");
		ts.add("Mayur");
		ts.add("Ajay");
		ts.add("Zartaj");

		Iterator<String> itr = ts.descendingIterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
		}
	}
}