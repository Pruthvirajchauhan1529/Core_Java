package MultiThreadingDurga;

class MyThread extends Thread{
	public void run(){
		for (int i=1; i<=1000; i++) {
			System.out.println("I am lazy Thread-"+i);
		}
		//System.out.println("I am entering into sleeping state");
		try{
			Thread.sleep(50);
		}catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}
}

class SleepThreadDemo2{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}
}