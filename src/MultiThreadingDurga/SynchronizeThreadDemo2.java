package MultiThreadingDurga;

class Display{
	public synchronized void displayn(){
		for (int i =1; i<=10; i++ ) {
			System.out.print(i+" ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public synchronized void displayc(){
		for (int i=65; i<=74; i++) {
			System.out.print((char)i+" ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class MyClass1 extends Thread{
	Display d;
	MyClass1(Display d){
		this.d = d;
	}
	public void run(){
		d.displayn();
	}
}
class MyClass2 extends Thread{
	Display d;
	MyClass2(Display d){
		this.d = d;
	}
	public void run(){
		d.displayc();
	}
}
class SynchronizeThreadDemo2{
	public static void main(String[] args) {
		Display d = new Display();
		MyClass1 t1 = new MyClass1(d);
		MyClass2 t2 = new MyClass2(d);
		t1.start();
		t2.start();
	}
}