package MultiThreading.synchronization;

public class SynchronizationDemo{
	public static void main(String[] args) {
			
			DisplayMessage dm = new DisplayMessage();

			MyThread t1 = new MyThread(dm, "Janak");
			MyThread t2 = new MyThread(dm, "Palak");

			t1.start();
			t2.start(); 
		}	
}