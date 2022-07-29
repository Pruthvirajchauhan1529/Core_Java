package MultiThreading.interrupt;

class MyThread extends Thread{

	public void run(){

		try{
				for (int i=1; i<=10; i++) {
				System.out.println("I am a lazy Thread");
				Thread.sleep(2000);
			}	
		}catch(InterruptedException e){
				System.out.println("Got Interrupted");
		}
		
	}
}