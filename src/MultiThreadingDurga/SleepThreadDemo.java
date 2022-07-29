package MultiThreadingDurga;

class MyThread extends Thread{
	public void run(){
		try{
			for (int i=1; i<=10; i++) {
				System.out.println("I m Lazy Thread");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("I got Interrupted");
		}
	}
}
class SleepThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of the Main Thread");
	}
}