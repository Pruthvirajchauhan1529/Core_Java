package MultiThreadingDurga;

class test extends Thread{
	public void run(){
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread th = new Thread();
		th.start();
		System.out.println(th.currentThread().getName());
		
		test t =new test();
		t.start();
		
		for (int i=2; i<=10; i++) {
			System.out.println(i);

		}

	}
}