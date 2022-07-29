package Collection.ConcurrentCollection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
	
		static ConcurrentHashMap<String, String> courseRating = new ConcurrentHashMap<>();
			public void run(){
				try{
					Thread.sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				courseRating.put("C","5.0");
				//System.out.println(courseRating);
			}
		
	public static void main(String[] args) {	
		ConcurrentHashMapDemo concurrentHashMapDemo  = new ConcurrentHashMapDemo();
		concurrentHashMapDemo.start();

		courseRating.put("Java","5.0");
		courseRating.put("Python","4.8");
		courseRating.put("AWS","4.7");
		courseRating.put("C++","4.9");
		courseRating.put("AWS","3.9");

		//System.out.println(course);
		// Iterator<String> itr = course.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
		for (String s : courseRating.keySet() ) {
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(s);
			//courseRating.remove("Python");
		}
		courseRating.put(".Net","4.1");
		courseRating.put("React","4.3");
		 System.out.println(courseRating);
	}
}