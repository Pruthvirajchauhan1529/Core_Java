package Collection.Task;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo{
	public static void main(String[] args) {
		
		Set<String> course = new HashSet<>();
		course.add("Java");
		course.add("C++");
		course.add("C");
		course.add("Pythod");
		course.add("PHP");
		course.add("React");

		System.out.println(course.add("PPPP"));
		System.out.println(course);

		//Enhanced for loop
		for(String courses : course){
			System.out.println(courses);
		}
	}
}