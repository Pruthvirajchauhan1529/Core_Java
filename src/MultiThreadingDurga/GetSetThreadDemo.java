package MultiThreadingDurga;

class MyThread extends Thread{

}

class GetSetThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Pruthviraj Chauhan");
		System.out.println(Thread.currentThread().getName());
		
	}
}