package Polymorphism.Overriding;

class P{

	public void property(){
		System.out.println("Cash, Land and Gold");
	}
	public void marry(){
		System.out.println("Subh Laxmi");
	}
}
class C extends P{
	public void marry(){
		System.out.println("charmi, Rekha and Priti");
	}
}
class OverrideCase01{
	public static void main(String[] args) {
		P p = new P(); // parent property access
		p.property();
		p.marry();	

		C c = new C(); // child property access
		c.marry();

		P p1 = new C(); // child propert access
		p1.marry();
	}
}