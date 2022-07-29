package MultiThreadingDurga;

class MyThread extends Thread{
	public void run(){
		System.out.println("child Thread");
	}
}
class ConstMultiThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("main Method");
	}
}