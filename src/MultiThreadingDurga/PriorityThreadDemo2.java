package MultiThreadingDurga;

class MyThread extends Thread{

	public void run(){
		for (int i=1; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}
class PriorityThreadDemo2{
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.setPriority(9);
		//System.out.println(t.getPriority());
		t.start();
		for (int i=1; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}	