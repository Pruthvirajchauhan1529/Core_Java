package MultiThreadingDurga;

class ThreadA1{
	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		t.join();
		System.out.println(t.total);
	}
}

class ThreadB extends Thread{
	int total=0;
	public void run(){
		for (int i=1; i<100; i++) {
			total = total + i;
		}
		System.out.println(total);
	}

}