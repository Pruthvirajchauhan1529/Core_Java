package MultiThreading;

class SleepThread extends Thread{
	public static void main(String[] args) throws InterruptedException {
		
		SleepThread st = new SleepThread();
		st.start();
	
		// try{
		// 		for (int j=1; j<=20; j++) {
		// 		System.out.print("J : "+j+"\t");
		// 		Thread.sleep(1000);
		// 	}
		// }catch(InterruptedException e){
		// 		System.out.println("Got Interrupted");
		// 	}
		st.interrupt();
		System.out.println("End of the main method");
	
	}
	public void run(){
		try{
			for (int i=1; i<=20; i++) {
				System.out.print("I : "+i+"\t");
				Thread.sleep(1000);	
			}
		}catch(InterruptedException e){
				System.out.println("Got Interrupted");
			}
	}
}