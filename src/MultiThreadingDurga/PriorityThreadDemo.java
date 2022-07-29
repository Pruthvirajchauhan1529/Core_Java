package MultiThreadingDurga;

class MyThread extends Thread{

}

class PriorityThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(6);
		MyThread t = new MyThread();
		System.out.println(t.getPriority());
		
	}
}