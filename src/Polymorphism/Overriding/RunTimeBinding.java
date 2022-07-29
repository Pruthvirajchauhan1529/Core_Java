package Polymorphism.Overriding;

class MACBook implements AppleLaptop{

	public void start(){
		System.out.println("Inside MacBook Start");
	}
	public void shutdown(){
		System.out.println("Inside MacBook Shutdown");
	}
}
class MACBookPro extends MACBook{

	public void start(){
		System.out.println("Inside MACBookPro start method");
	}
	public void shutdown(){
		System.out.println("Inside MACBookPro shutdown method");
	}
}
class MACBookAir extends MACBook{

	public void start(){
		System.out.println("Inside MACBookAir start method");
	}
	public void shutdown(){
		System.out.println("Inside MACBookAir shutdown method");
	}
}
class RunTimeBinding{
		public static void main(String[] args) {
			
			AppleLaptop m1 = new MACBookPro();
			AppleLaptop m2 = new MACBookAir();		
			m1.start();
			m1.shutdown();

			MACBookPro m3 = (MACBookPro) m1;

			m2.start();
			m2.shutdown();

			MACBookAir m4 = (MACBookAir)m2;
		}
}