package MultiThreading.daemon;

public class DaemonDemo{
	public static void main(String[] args) {
		 
		 System.out.println(Thread.currentThread().isDaemon());

		 MyThread mt1 = new MyThread();
		 mt1.setDaemon(true); 
		 System.out.println(mt1.isDaemon());
		 mt1.start();

	}
}