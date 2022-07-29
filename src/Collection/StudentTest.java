package Collection;

import java.util.*;

class Student{
	int roll;
	String name;
	String address;
	String stander;

	public Student(int roll, String name, String address, String stander){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.stander = stander;
	}
	public String toString(){
		return "Student roll no = "+roll+ ", Name "+name+ ", Address "+address+", Stander "+stander;
	}
}


public class StudentTest{
	public static void main(String[] args) {
			
		Student st1 = new Student(10,"Ankita","Bapunagar","10th");
		Student st2 = new Student(20,"Prakash","Rajpur","11th");
		Student st3 = new Student(30,"Mohit","Rakhiyal","12th");
		Student st4 = new Student(40,"Renuka","Raipur","8th");
		Student st5 = new Student(50,"Sonu","Saraspur","7th");
		Student st6 = new Student(60,"Kajal","Nikol","9th");
		Student st7 = new Student(70,"abhishek","Sola","6th");
		Student st8 = new Student(80,"Vipul","Isanpur","11th");
		Student st9 = new Student(90,"Montu","Gota","12th");
		Student st10 = new Student(95,"Dhruvi","Vadaj","10th");

		List<Student> list = new LinkedList<>();

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		list.add(st7);
		list.add(st8);
		list.add(st9);
		list.add(st10);

		List<String> stdName = new ArrayList<>();

		for (Student st : list) {
			System.out.println(st.name);	
		}

		
		
		

	}
}