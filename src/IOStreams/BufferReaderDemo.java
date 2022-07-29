package IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

class BufferReaderDemo{
	public static void main(String[] args) {
		
	FileReader fr = null;
	BufferedReader br = null;

	int count =0;

	try{
			fr = new FileReader("/D:/myfile.txt");
			br = new BufferedReader(fr);

			String line;
			while((line = br.readLine())!= null){
				StringTokenizer st = new StringTokenizer(line);
					while(st.hasMoreTokens()){
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println();
			System.out.println("Number of words in the file are : "+count);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fr.close();
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}