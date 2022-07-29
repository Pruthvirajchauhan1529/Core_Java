package MultiThreading.interrupt;

class InterruptDemo{

	public static void main(String[] args) {
		
		MyThread m = new MyThread();

		m.start();
		m.interrupt();
		System.out.println("End of the main method");
	}
}