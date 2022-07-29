package IOStreams;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo{
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(new File("/D:/myfile.txt"));
			System.out.println("File is opened");

			int i;
			while((i = fis.read())!= -1){
				System.out.print((char) i);
			}
			System.out.println();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();	
			}catch(IOException e){
				e.printStackTrace();
			}
			System.out.print("File closed");
		}
	}
}