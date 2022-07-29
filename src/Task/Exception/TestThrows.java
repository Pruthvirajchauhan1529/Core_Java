package Task.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
	void readFile() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("d:/abcd.txt");
	}
	void saveFile() throws FileNotFoundException{
		String text= "This is Demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
	}
}

public class TestThrows{
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try{
			rw.readFile();
			rw.saveFile();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try{
			rw.saveFile();	
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		System.out.println("Hellooo");
	}
}