package Collection.Task.MapTask;

import java.util.*;

class StudentDetails{

	public static HashMap<Integer, StudentMap2> getStudentList1(){

		HashMap<Integer, StudentMap2> map = new HashMap<>();

		map.put(1,new StudentMap2(01,"Pratik","Bapunagar","12th"));
		map.put(2,new StudentMap2(02,"Ankit","Isakon","10th"));
		map.put(3,new StudentMap2(03,"Dhruv","Maninagar","11th"));
		map.put(4,new StudentMap2(04,"Chintan","Sola","8th"));
		map.put(5,new StudentMap2(05,"Bhavesh","Nikol","9th"));
		map.put(6,new StudentMap2(06,"Nikunj","Saraspur","7th"));

		return map;
	}

	public static LinkedHashMap<Integer, StudentMap2> getStudentList2(){

		LinkedHashMap<Integer, StudentMap2> map = new LinkedHashMap<>();

		map.put(1,new StudentMap2(01,"Pratik","Bapunagar","12th"));
		map.put(6,new StudentMap2(02,"Ankit","Isakon","10th"));
		map.put(4,new StudentMap2(03,"Dhruv","Maninagar","11th"));
		map.put(5,new StudentMap2(04,"Chintan","Sola","8th"));
		map.put(2,new StudentMap2(05,"Bhavesh","Nikol","9th"));
		map.put(3,new StudentMap2(06,"Nikunj","Saraspur","7th"));

		return map;	
	}

	// public static TreeSet<Integer, StudentMap2> getStudentList3(){

	// 	TreeSet<Integer, StudentMap2> std = new TreeSet<>();

	// 	map.put(1,new StudentMap2(01,"Mohit","Bapunagar","12th"));
	// 	map.put(5,new StudentMap2(02,"Apurva","Isakon","10th"));
	// 	map.put(2,new StudentMap2(03,"Bhavin","Maninagar","11th"));
	// 	map.put(3,new StudentMap2(04,"Vipul","Sola","8th"));
	// 	map.put(4,new StudentMap2(05,"Dinesh","Nikol","9th"));
	// 	map.put(6,new StudentMap2(06,"Nikhil","Saraspur","7th"));

	// 	return std;
	// }
}