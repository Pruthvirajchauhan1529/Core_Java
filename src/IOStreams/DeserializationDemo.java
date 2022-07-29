package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("/D:/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

	 	Object obj = new ois.readObject();
	 	Employee emp = (Employee) obj;

	 	System.out.println("Employee Id : " + emp.id());
	 	System.out.println("Employee name : " + emp.name());
	 	System.out.println("Employee Salary : " + emp.salary());
	 	System.out.println("Employee SSN : " + emp.ssn());
	}
}		