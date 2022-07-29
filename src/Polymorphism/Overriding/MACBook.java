package Polymorphism.Overriding;

class MACBook{

	void start(){
		System.out.println("Inside MacBook Start");
	}
	void shutdown(){
		System.out.println("Inside MacBook Shutdown");
	}
}
class MACBookPro extends MACBook{

	void start(){
		System.out.println("Inside MACBookPro start method");
	}
	void shutdown(){
		System.out.println("Inside MACBookPro shutdown method");
	}
}
class MACBookAir extends MACBook{

	void start(){
		System.out.println("Inside MACBookAir start method");
	}
	void shutdown(){
		System.out.println("Inside MACBookAir shutdown method");
	}
}
class RunTimeBinding{
		public static void main(String[] args) {
			
			MACBook m1 = new MACBookPro();
			m1.start();
			m1.shutdown();
		}
}