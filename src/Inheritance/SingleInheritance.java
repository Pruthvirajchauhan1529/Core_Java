package Inheritance;

class SingleInheritance{
	
	void m1(){
		System.out.println("Inside M1");
	}
	public static void main(String[] args) {
		
		SingleInheritance si = new SingleInheritance();
		si.m1();
		si.hashCode();
		si.getClass();
	}
}