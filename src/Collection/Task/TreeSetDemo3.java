package Collection.Task;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;

class TreeSetDemo3{
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(22);
		ts.add(34);
		ts.add(66);
		ts.add(88);
		ts.add(21);
		ts.add(90);
		ts.add(54);

		System.out.println("Highest Value :- "+ts.pollFirst());
		System.out.println("Lowest Vslue :- "+t.pollLast());

		Iterator<Integer> itr  = ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(ts);
	}
}