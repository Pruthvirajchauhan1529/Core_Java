package MultiThreadingDurga;

class ThreadB2 extends Thread{
	int total = 0;
	public void run(){
		synchronized(this){
			System.out.println(" child thread starts calculation"); //2
			for (int i=1; i<=100; i++) {
				total = total + i;
			}
			System.out.println(" child thread giving notification"); //3
			this.notify();
		}
	}
}
class ThreadA2{
	public static void main(String[] args) throws Exception {
		ThreadB2 b = new ThreadB2();
		b.start();
		Thread.sleep(10000);
		synchronized(b){
			System.out.println(" Main thread calling wait method");// 1
			b.wait(10000);
			System.out.println(" Main thread got notification"); // 4
			System.out.println(" "+b.total); //5
		}		
	}
}