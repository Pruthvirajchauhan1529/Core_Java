package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseDemo{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(19);
		list.add(15);
		list.add(35);
		list.add(25);		
		list.add(90);
		list.add(75);

		System.out.println("Befor Reversing: "+list);
		Collections.reverse(list);
		System.out.println("After Reversing: "+list);

		
	}
}