package Collection;//import java.util.Comparable;
import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

//class Employee implements Comparable<Employee>{
class Employees implements Comparator<Employees>{
	int id;
	String name;

	public Employees(int id, String name){
		this.id = id;
		this.name = name;
	}

	// public int compareTo(Employee e){
	// 	int id1 = this.id;
	// 	int id2 = e.id;

	// 	return id1 - id2;
	// }
	public int compare(Employees o1, Employees o2){
		String s1 = o1.name;
		String s2 = o2.name;
		
		return s1.comparTo(s2);
	}
}

public class EmployeeObjectDemo{
	public static void main(String[] args) {
		
		Set<Employees> set = new TreeSet<>(new Employees());
		set.add(new Employees(100, "Bharat"));
		set.add(new Employees(105, "Akash"));
		set.add(new Employees(104, "Prakash"));
		set.add(new Employees(103, "Dhaval"));
		set.add(new Employees(102, "Chintan"));


		for (Employees emp : set) {
			//System.out.println(set);
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
	}
}