package Collection.Task;

import java.util.*;
import java.lang.*;


class Student{

	int rollno;
	String name, address;
	 public Student(int rollno,String name,String address){
	 	this.rollno = rollno;
	 	this.name = name;
	 	this.address = address;
	 }

	 public String toString(){
	 	return this.rollno+" "+this.name+" "+this.address;
	 }
}
class Sortbyroll implements Comparator<Student>{

	public int compare(Student a, Student b){
		if(a.rollno > b.rollno){
			return 1;
		}else if(a.rollno < b.rollno){
			return -1;
		}else{
			return 0;
		}
		//return a.rollno - b.rollno;
	}
}

class SortbyName implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.name.compareTo(b.name);
	}
}

public class SortedStudentDemo{
	public static void main(String[] args) {
		
		//ArrayList<Student> list = StudentData.getStudentList();

		HashSet<Student> set = new HashSet<>();
		set.add(new Student(111,"Harsh","Bapunagar"));
		set.add(new Student(123,"Anup","Krishnanagar"));
		set.add(new Student(122,"Avadh","Sola"));
		set.add(new Student(124,"Avinash","Isakon"));
		set.add(new Student(111,"Harsh","Bapunagar"));

		ArrayList<Student> als = new ArrayList<Student>(set);
		Collections.sort(als, new Sortbyroll());
		Collections.sort(als, new SortbyName());
		for (Student st : als) {
			System.out.println(st);
		}

		// System.out.println("Unsorted");
		// for (int i=0; i<set.size(); i++) {
		// 	System.out.println(set.get(i));
		// }
		
		// System.out.println("------------------------------------");
		// Collections.sort(list, new Sortbyroll());
		// System.out.println("Sorted By Roll_Number");
		// for (int i=0; i<list.size(); i++) {
		// 	System.out.println(list.get(i));
		// }

		// System.out.println("------------------------------------");
		// Collections.sort(list, new SortbyName());
		// System.out.println("Sorted By Name");
		// for(int i=0;i<list.size();i++){
		// 	System.out.println(list.get(i));
		// }
	}
}