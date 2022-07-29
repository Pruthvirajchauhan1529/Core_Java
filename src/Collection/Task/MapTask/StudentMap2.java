package Collection.Task.MapTask;
//import java.util.Comparator;


public class StudentMap2 implements Comparable<StudentMap2>{

	int roll;
	String name, address, stander;

	public StudentMap2(int roll, String name, String address, String stander){
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.stander = stander;
	}

	public String toString(){
		return "Roll "+ roll + " Name "+ name +" Address "+ address + " Standet "+ stander ;
	}

	public int compareTo(StudentMap2 st1){

		// if(this.name > st1.name){
		// 	return 1;
		// }else if(this.name < st1.name){
		// 	return -1; 
		// }else{
		// 	return 0;
		// }
		// return this.roll - st1.roll;
		return this.name.compareTo(st1.name);
	}
}