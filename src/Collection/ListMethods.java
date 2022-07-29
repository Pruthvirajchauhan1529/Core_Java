package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 10; i<=100; i = i+10) {
			list.add(i);
		}
		System.out.println("List : "+list);

		list.add(2,100);
		System.out.println("After Adding List : "+list);

		list.set(3,200);
		System.out.println("Replacement List : "+list);

		List<Integer> secondlist = new ArrayList<>();
		
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);

		System.out.println("Second Lisr : "+secondlist);

		// list.addAll(secondlist);
		// System.out.println("After Adding Second List : "+list);

		list.addAll(3,secondlist);
		System.out.println("After Adding Second List : "+list);

		if(list.contains(1131)){
			System.out.println("List has the value");
		}else{
			System.out.println("List do not has the value");
		}

		System.out.println("Elements in the list are : ");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.remove(3);
		System.out.println("After Deletion : "+list);

	}
}