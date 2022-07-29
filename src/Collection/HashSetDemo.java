package Collection;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo{
	public static void main(String[] args) {
		
		Random obj =new	 Random();

		List<Integer> list = new ArrayList<>();

		for (int i=1; i<=10; i++) {
			int number = obj.nextInt(5);
			list.add(number);
		}

		System.out.println("List :"+list);

		Set<Integer> set = new HashSet<>();
		for (int i=1; i<=10; i++) {
			int number = obj.nextInt(6);
			set.add(number);
		}
		System.out.println("Set : "+set);
	}
}