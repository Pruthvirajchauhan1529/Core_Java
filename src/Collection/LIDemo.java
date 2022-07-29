package Collection;

import java.util.ListIterator;
import java.util.List;
import java.util.LinkedList;

public class LIDemo{
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();

		list.add("abc");
		list.add("nop");
		list.add("xyz");
		list.add("efg");

		ListIterator<String> itr = list.listIterator();

		System.out.println("Traversing the list in the forword direction");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Traversing the list in the backword direction");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}