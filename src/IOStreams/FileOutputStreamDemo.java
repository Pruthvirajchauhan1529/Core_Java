package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStreamDemo{
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try{
			fis = new FileInputStream("/D:/Pick/Pruthviraj.jpeg");
			fos = new FileOutputStream("/D:/Pick/NP.jpeg");	
			int data;
			while((data = fis.read())!= -1){
				fos.write(data);
			}
			System.out.println("File copied");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}