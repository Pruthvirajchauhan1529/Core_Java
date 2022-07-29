package MultiThreadingDurga;

class MyThread extends Thread{

	static Thread mt;

	public void run(){
		try{
			mt.join(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}

class JoinThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		//t.join();

		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}