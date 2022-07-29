package Collection.ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProbleThread extends Thread{
	
		static CopyOnWriteArrayList<String> course = new CopyOnWriteArrayList<>();
		public void run(){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			course.add("React");
		}
		
	public static void main(String[] args) {	
		ArrayListProbleThread ArrayListProbleThread  = new ArrayListProbleThread();
		ArrayListProbleThread.start();

		course.add("Java");
		course.add("Python");
		course.add("AWS");
		//course.add("React");

		//System.out.println(course);
		// Iterator<String> itr = course.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
		for (String s : course ) {
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(s);
			course.remove("Python");
		}
		course.add(".Net");
		System.out.println(course);
	}
}