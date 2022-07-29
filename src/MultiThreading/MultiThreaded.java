package MultiThreading;

public class MultiThreaded extends Thread{

	public static void main(String[] args) {

		MultiThreaded mt = new MultiThreaded();
		mt.start();

		Thread currentThread =Thread.currentThread();	
		currentThread.setName("This is First Thread Name");	
		System.out.println("Thread Name is "+ currentThread.getName());

		// for (int j=1; j<=100 ; j++ ) {
		// 	System.out.print("J : "+j+"\t");
		// }
	}
	public void run(){

		Thread currentThread=Thread.currentThread();
		currentThread.setName("This is Second Thread name");
		System.out.println("Thread Name is " +currentThread.getName());

		// for (int i=1;i<=100 ;i++ ) {
		// 	System.out.print("I : " +i+"\t");
		// }
	}
}