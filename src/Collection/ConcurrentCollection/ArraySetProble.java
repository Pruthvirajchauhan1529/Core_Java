package Collection.ConcurrentCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProble extends Thread{
	
		static CopyOnWriteArraySet<String> course = new CopyOnWriteArraySet<>();
		public void run(){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			//System.out.println(course);
		}
		
	public static void main(String[] args) {	
		ArrayListProbleThread ArrayListProbleThread  = new ArrayListProbleThread();
		ArrayListProbleThread.start();

		course.add("Java");
		course.add("Python");
		course.add("AWS");
		course.add("C++");
		course.add("AWS");

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
			//course.remove("Python");
		}
		course.add(".Net");
		course.add("React");
		System.out.println(course);
	}
}