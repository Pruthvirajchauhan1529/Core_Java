package Collection.Task;

import java.util.TreeSet;
//import java.util.*;

class NavigableSetDemo{
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		//ts.add("FFF");

		System.out.println("Initail Set :- "+ts);

		System.out.println("Reverse Set :- "+ ts.descendingSet());

		System.out.println("Head Set :- "+ ts.headSet("C",true));

		System.out.println("Sub Set :- "+ ts.subSet("A",false, "E",true));

		System.out.println("Tail Set :- "+ ts.tailSet("C",true));

	}
}