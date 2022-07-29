package MultiThreading.threadcommunication;

class MyThread extends Thread{

	int total;
	public void run(){
		System.out.println("child Thread is caculating the sum :");

		synchronized (this){
				for (int i=1; i<=100; i++) {
				total = total + i;
			}	
			this.notify();
		}
			
	}
}