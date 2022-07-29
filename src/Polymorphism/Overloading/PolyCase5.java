package Polymorphism.Overloading;

class PolyCase5{

	public void m1(int i){
			System.out.println("General Method");
	}
	public void m1(int... j){
		System.out.println("Var arg method");
	}

	public static void main(String[] args) {
		PolyCase5 pl = new PolyCase5();
		pl.m1();
		pl.m1(10,20);
		pl.m1(10);
		pl.m1(12,11,3,22);
	}
}