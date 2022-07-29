package Polymorphism.Overloading;

class PolyCase4{

	public void m1(int i, float j){
		System.out.println("int float version");
	}
	public void m1(float i, int j){
		System.out.println("float int version");
	}
	public static void main(String[] args) {
		PolyCase4 pl = new PolyCase4();
		pl.m1(10,10.5f);
		pl.m1(10.5f,10);
		//pl.m1(10,10);
		pl.m1(10.5f,10.5f);
	}
}