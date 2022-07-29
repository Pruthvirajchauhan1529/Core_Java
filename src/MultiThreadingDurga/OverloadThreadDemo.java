package MultiThreadingDurga;

class MyThread extends Thread{

	public void run(){
		System.out.println("No agrs method");
	}
	public void run(int i){
		System.out.println("int agrs method");
	}
}
class OverloadThreadDemo{

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
			t1.start();

			//t.start(10);	
	}
}