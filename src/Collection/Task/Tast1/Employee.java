package Collection.Task.Tast1;

public class Employee implements Comparable<Employee>{

	int id;
	String name, email, department;
	float sal;

	public Employee(int id, String name, String email, String department, float sal){
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.sal = sal;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department){
		this.department = department;
	}
	public float getSalary(){
		return sal;
	}	
	public void setSalary(float sal){
		this.sal = sal ;
	}

	public String toString(){

		return "Id "+ id +" Name: "+ name +" Email Id: "+email+" Department: "+ department+" Salary: "+sal;
	}

	public int compareTo(Employee empl2){
		return this.name.compareTo(empl2.name);
	}

}