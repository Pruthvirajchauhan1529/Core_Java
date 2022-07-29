package Collection.ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProble{
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> course = new CopyOnWriteArrayList<>();

		course.add("Java");
		course.add("Python");
		course.add("AWS");
		course.add("React");

		System.out.println(course);
		// Iterator<String> itr = course.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
		for (String s : course ) {
			System.out.println(s);
			//course.add(".Net");
			course.remove("Python");
		}
		course.add(".Net");
		System.out.println(course);
	}
}