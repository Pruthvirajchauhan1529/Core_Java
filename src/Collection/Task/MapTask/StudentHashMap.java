package Collection.Task.MapTask;

import java.util.*;

class student{
	int roll;
	String name;
	String address;
	int marks;
	public student(int roll,String name,String address, int marks){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public String toString(){
		return "Roll No "+ roll+" Name "+name+" Address "+address+" Marks "+marks;
	}
}

public class StudentHashMap{
	public static void main(String[] args) {
		Map<Integer, student> map = new HashMap<Integer, student>();

		student st1 = new student(01,"Anup","Krishnanagr",88);
		student st2 = new student(02,"Harsh","Gota",90);
		student st3 = new student(03,"Bhavesh","Rakhiyal",56);
		student st4 = new student(03,"Ketan","Rakhiyal",56);

		map.put(1,st1);
		map.put(2,st2);
		map.put(3,st3);
		map.put(3,st4);

		// Collection<student> value = map.values();
		// System.out.println("Values: "+value);
		// Collection<Integer> key = map.keySet();
		// System.out.println("Key: "+key);
		System.out.println("The values are: "+map.values());
		System.out.println("The Key is: "+map.keySet());

		for (Map.Entry<Integer, student> m : map.entrySet() ) {
			// System.out.println("Values: "+ m.getValue());
			// System.out.println();
			System.out.println(m);
		}
		System.out.println("The value is: "+map.get(3));
	}
}