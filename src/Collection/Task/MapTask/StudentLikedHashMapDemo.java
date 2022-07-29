package Collection.Task.MapTask;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collection;

public class StudentLikedHashMapDemo{
	public static void main(String[] args) {
		
		// StudentMap2 std1 = new StudentMap2(01,"Pratik","Bapunagar","12th");
		// StudentMap2 std2 = new StudentMap2(02,"Ankit","Isakon","10th");
		// StudentMap2 std3 = new StudentMap2(03,"Dhruv","Maninagar","11th");
		// StudentMap2 std4 = new StudentMap2(04,"Nishant","Sola","8th");
		// StudentMap2 std5 = new StudentMap2(05,"Bhavesh","Nikol","9th");
		// StudentMap2 std6 = new StudentMap2(06,"Nikunj","Saraspur","7th");


		// Map<Integer, StudentMap2> map = new LinkedHashMap<>();

		// map.put(1,std1);
		// map.put(2,std2);
		// map.put(3,std3);
		// map.put(4,std4);
		// map.put(5,std5);
		// map.put(3,std6);

		LinkedHashMap<Integer, StudentMap2> map = StudentDetails.getStudentList2();

		//System.out.println(map);
		Collection<StudentMap2> value = map.values();
			System.out.println(value);
		Collection<Integer> key = map.keySet();
			System.out.println(key);	


		for (Map.Entry<Integer, StudentMap2> entry: map.entrySet() ) {

				System.out.println(entry);
		}

		System.out.println("The value is: "+map.get(4));
		// System.out.println("The Set is: "+map.keySet());
		// System.out.println("The value is: "+map.values());
	}
}