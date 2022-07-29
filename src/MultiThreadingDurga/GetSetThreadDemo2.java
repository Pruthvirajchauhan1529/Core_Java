package MultiThreadingDurga;

class MyThread extends Thread{
	public void run(){
		System.out.println("Run method executed by Thread :"+ Thread.currentThread().getName());
	}
}
class GetSetThreadDemo2{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Main method executed by Thread :" + Thread.currentThread().getName());
	}
}