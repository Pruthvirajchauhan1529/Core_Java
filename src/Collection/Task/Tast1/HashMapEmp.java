package Collection.Task.Tast1;

import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;

public class HashMapEmp{
	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new TreeMap<>();

		Employee emp1 = new Employee(01,"Pankaj","pankaj12@gmail.com","Java",200000.00f);
		Employee emp2 = new Employee(02,"Akash","Akash123@gmail.com","Python",150000.00f);
		Employee emp3 = new Employee(03,"Chirag","Chirag321@gmail.com",".Net",145000.00f);
		Employee emp4 = new Employee(04,"Bhavik","Bhavik456@gmail.com","PHP",135000.00f);
		Employee emp5 = new Employee(05,"Dharmesh","Dharmesh654@gmail.com","UI/UX",130000.00f);
		//Employee emp6 = new Employee(06,"Mohit","Akash123@gmail.com","Python",150000.00f);



		map.put(emp1,10);
		map.put(emp2,20);
		map.put(emp3,30);
		map.put(emp4,40);
		map.put(emp5,50);
		//map.put(emp6,60);

		//Collections.sort(sal);
		Collection<Integer> emp = map.values();
			System.out.println(emp);		

		Collection<Employee> key = map.keySet(getSalary());
			System.out.println("Salary : "+key);

		for (Map.Entry<Employee,Integer> entry : map.entrySet() ) {
			System.out.println(entry);
		}

	}
}