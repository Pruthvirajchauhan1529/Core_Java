package Collection.Task;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class StudentData {

	public static ArrayList<Student> getStudentList() {

		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(111,"Harsh","Bapunagar"));
		list.add(new Student(123,"Anup","Krishnanagar"));
		list.add(new Student(122,"Avadh","Sola"));
		list.add(new Student(124,"Avinash","Isakon"));
		list.add(new Student(111, "Pratik","Rajpur"));

		return list;
	}

	public static HashSet<Student> getStudentList2(){

		HashSet<Student> set = new HashSet<>();
		set.add(new Student(111,"Harsh","Bapunagar"));
		set.add(new Student(123,"Anup","Krishnanagar"));
		set.add(new Student(122,"Avadh","Sola"));
		set.add(new Student(124,"Avinash","Isakon"));
		set.add(new Student(111,"Harsh","Bapunagar"));

		return set;
	}
}