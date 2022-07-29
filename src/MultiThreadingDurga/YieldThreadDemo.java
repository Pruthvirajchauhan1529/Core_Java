package MultiThreadingDurga;

class MyThread extends Thread{
	public void run(){
		for (int i=1; i<10 ;i++) {
			System.out.println("Child Method");
			Thread.yield();
		}
	}
}
class YieldThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		for (int i=1; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}