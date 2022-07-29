package Collection;

import java.util.Set;
import java.util.TreeSet;


public class TestToString{
	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());

		set.add(new Employee(100,"Obama"));
		set.add(new Employee(400,"Trump"));
		set.add(new Employee(300,"Putin"));
		set.add(new Employee(200,"Modi"));

		for (Employee emp :set ) {
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}
}