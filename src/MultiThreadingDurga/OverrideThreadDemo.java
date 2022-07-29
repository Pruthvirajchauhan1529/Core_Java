package MultiThreadingDurga;

class MyThread extends Thread{


	public void start(){
		super.start();
		System.out.println("Start method executed");
	}
	public void run(){
		System.out.println("Run method executed");
	}
	// public void start(){
	// 	System.out.println("Start method executed");
	// }
}
class OverrideThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Main Thread executed");
	}
}