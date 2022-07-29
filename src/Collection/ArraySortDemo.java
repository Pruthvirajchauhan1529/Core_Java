package Collection;

import java.util.Arrays;
import java.util.List;

public class ArraySortDemo{
	public static void main(String[] args) {
		 
		int a[] = {30,10,20,50,5,40};

		System.out.println("Befor Sorting ");
		for (int num : a ) {
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(a);

		System.out.println("Afret Sorting ");
		for (int num : a ) {
			System.out.print(num+" ");
		}
		System.out.println();
		String s[] = {"V", "P", "N","C","A"};

		System.out.println("Befor Sorting ");
		for (String num : s ) {
			System.out.print(num+" ");
		}
		System.out.println();
		Arrays.sort(s);

		System.out.println("After Sorting ");
		for (String num : s ) {
			System.out.print(num+" ");
		}
		System.out.println();
		List<String> list =	Arrays.asList(s);
		s[1] = "D";
		///list.add("J");

		System.out.println(list);

	}
}