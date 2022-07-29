package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(20));
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(35);
		list.add(40);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add(new String("Mohini"));
		list2.add("Komal");
		list2.add("Pratima");
		list2.add("Disha");
		list2.add("Payal");
		list2.add("Bhumi");

		Collections.sort(list);
		Collections.sort(list2, Collections.reverseOrder());

		//list.add("Hello");
		//System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		Iterator<String> itr2 = list2.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		//	itr.remove();
		}
		System.out.println("-----------------------------------");	
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

			// for (String Student : list2) {
			// 	System.out.println(list2);
			// }
		//System.out.println(itr2.next());
		//System.out.println(list);
	}
}