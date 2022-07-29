package Collection.Task.MapTask;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;

public class StudentTreeMapDemo{
	public static void main(String[] args) {

		StudentMap2 std1 = new StudentMap2(01,"Pratik","Bapunagar","12th");
		StudentMap2 std2 = new StudentMap2(02,"Ankit","Isakon","10th");
		StudentMap2 std3 = new StudentMap2(03,"Dhruv","Maninagar","11th");
		StudentMap2 std4 = new StudentMap2(04,"Chintan","Sola","8th");
		StudentMap2 std5 = new StudentMap2(05,"Bhavesh","Nikol","9th");
		StudentMap2 std6 = new StudentMap2(06,"Nikunj","Saraspur","7th");
		StudentMap2 std7 = std1;


		Map<StudentMap2, Integer> map = new TreeMap<>();

		map.put(std1, 1);
		map.put(std2, 2);
		map.put(std3, 3);
		map.put(std4, 4);
		map.put(std5, 5);
		map.put(std7, 6);	

		// Collections.sort(map);	

		Collection<Integer> values = map.values();
		System.out.println("Values: "+values);	

		//System.out.println(map);
		for (Map.Entry<StudentMap2, Integer> entry: map.entrySet() ) {
				System.out.println(entry);
		}

		System.out.println("The value is: "+map.get(std2));
	}
}