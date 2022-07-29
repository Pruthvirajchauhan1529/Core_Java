package Abstraction;

abstract class BMW{

	void commanFunc(){
		System.out.println("Inside the commanFunc Method...");
	}
	abstract void accelerate();

	public static void main(String[] args) {
		System.out.println("This main method of abstract class");
	}
}