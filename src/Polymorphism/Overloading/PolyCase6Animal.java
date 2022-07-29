package Polymorphism.Overloading;

class Animal{

}
class Monkey extends Animal{

}
class PolyCase6Animal
{
	public void m1(Animal a){
		System.out.println("Animal version");
	}
	public void m1(Monkey m){
		System.out.println("Monkey Version");
	}

	public static void main(String[] args) {
		PolyCase6Animal pl = new PolyCase6Animal();

		Animal a = new Animal();
		pl.m1(a);

		Monkey m = new Monkey();
		pl.m1(m);

		Animal a1 = new Monkey();
		pl.m1(a1);
	}
}
