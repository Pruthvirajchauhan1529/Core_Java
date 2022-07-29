package Collection.Task;

import java.util.List;

public class Student{

	private int id;
	private String name;
	private int age;
	private int roll;
	private List<SubjectTask> subjectList;
	private List<Standerd> standerList;

	public List<Standerd> getStanderList(){
		return standerList;
	}
	public void setStanderList(List<Standerd> standerList){
		this.standerList = standerList;
	}
	public List<SubjectTask> getSub(){
		return subjectList;
	}
	public void setSub(List<SubjectTask> subjectList){
		this.subjectList = subjectList;
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
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getRoll(){
		return roll;
	}
	public void setRoll(int roll){
		this.roll = roll;
	}

	@Override
	public String toString(){
		return "Student {" + "Id =" + id + ", Name =" + name + ", Age =" + age + ", Roll =" + roll + 
					" SubjectTask =" + subjectList + " StanderList ="+ standerList +  "}";
	}
}