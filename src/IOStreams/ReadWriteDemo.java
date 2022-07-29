package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadWriteDemo{
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("/D:/myfile.txt");
			fw = new FileWriter("/D:/newFile.txt");

			int ch;
			while((ch = fr.read())!= -1){
				fw.write(ch);
			}
			System.out.println("File Copied");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fr.close();
				fw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}