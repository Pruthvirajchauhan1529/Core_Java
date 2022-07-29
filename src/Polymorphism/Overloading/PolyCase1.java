package Polymorphism.Overloading;

class PolyCase1{
	
	public void m1(int i){
		System.out.println("int arguments");
	}	
	public void m1(float a){
		System.out.println("float arguments");
	}

	public static void main(String[] args) {
		
		PolyCase1 pl = new PolyCase1();
		pl.m1(10);
		pl.m1(10.5f);
		pl.m1('a');
		pl.m1(10l);
		
	}
}