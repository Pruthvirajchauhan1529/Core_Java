package IOStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class SerializationDemo{
	public static void main(String[] args) {
		
		FileOutputStream fos ;
		ObjectOutputStream oos;

		try{
			fos = new FileOutputStream("/D:/Emp.ser");
			oos = new ObjectOutputStream(fos);

			Employee emp = new Employee(1,"Abhi",25000,123456);
			oos.writeObject(emp);
			System.out.println("Employee Object Serialized");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
}