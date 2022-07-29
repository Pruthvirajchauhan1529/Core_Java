package MultiThreadingDurga;

class MyThread extends Thread{

	public void run(){
		for (int i=0; i<10; i++) {
			System.out.println("Seetha Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class JoinThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		try{
			t.join(10000);	
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}