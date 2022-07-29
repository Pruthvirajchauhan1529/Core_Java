package Collection.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentDemo{
	public static void main(String[] args) {
		
		SubjectTask sub1 = new SubjectTask();
		sub1.setId(01);
		sub1.setName("Java");
		SubjectTask sub2 = new SubjectTask();
		sub2.setId(02);
		sub2.setName("C++");
		
		List<SubjectTask> sbl = new ArrayList<>();
		sbl.add(sub1);
		sbl.add(sub2);

		Standerd std1 = new Standerd();
		std1.setId(01);
		std1.setName("First Standerd");

		Standerd std2 = new Standerd();
		std2.setId(02);
		std2.setName("Second Standerd");

		List<Standerd> standerd = new ArrayList<>();
		standerd.add(std1);
		standerd.add(std2);		

		Student st = new Student();
		st.setId(01);
		st.setName("Ravi");
		st.setAge(18);
		st.setRoll(11);
		st.setSub(sbl);
		st.setStanderList(standerd);

		Student st1 = new Student();
		st1.setId(02);
		st1.setName("Mayuri");
		st1.setAge(20);
		st1.setRoll(15);
		st1.setSub(sbl);
		st1.setStanderList(standerd);

		
		List<Student> list = new ArrayList<>();
		
		list.add(st);
		list.add(st1);
		
		Set<Student> set = new HashSet<>();

		set.add(st);
		set.add(st1);
		
		TreeSet<Student> tree = new TreeSet<>();

		tree.add(st);
		tree.add(st1);


		// for (int i=0; i<list.size();i++ ) {
		// 	System.out.println(list.get(i));
		// }
		
		for (Student student : set) {
			System.out.println("Printing Student : " + student.getId());
			System.out.println("Printing Student : " + student.getName());
			System.out.println("Printing Student : " + student.getAge());
			System.out.println("Printing Student : " + student.getRoll());
			System.out.println("Printing Student : " + student.getSub());
			System.out.println("Printing Student : " + student.getStanderList());
			System.out.println();
		}

	 	//Iterator<Student> itr =list.iterator();	

	 	// ListIterator<Student> li = list.listIterator();

	 	//  while(li.hasNext()){
	 	//  	Student stu = li.next();
	 	//  	System.out.println(stu.getId());
	 	// 	System.out.println(stu.getName());
	 	// 	System.out.println(stu.getAge());
	 	// 	System.out.println(stu.getRoll());
	 	// 	System.out.println(stu.getSub());
	 	// 	System.out.println(stu.getStanderList());

	 		// System.out.println(li.next().getId());
	 		// System.out.println(li.next().getName());
	 		// System.out.println(li.next().getAge());
	 		// System.out.println(li.next().getRoll());
	 		// System.out.println(li.next().getSub());
	 		// System.out.println(li.next().getStanderList());
	 		System.out.println("");
	 		//System.out.println(li.next());
	 	// }
	}
}