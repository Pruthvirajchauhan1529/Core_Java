package Collection.Task;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.*;

class TreeSetDemo1{
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Ravi");
		ts.add("Ajay");
		ts.add("Vipul");	
		ts.add("Satish");	
		ts.add("Mayur");
		ts.add("Ajay");
		ts.add("Ravi");
		ts.add("Bhavesh");


		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}