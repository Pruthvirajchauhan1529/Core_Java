package Polymorphism.Overriding;

class Overridings{

	public static void main(String[] args) {
		
		// Child c = new Child();
		// c.doSomething();
		Parent.doSomething();
		Child.doSomething();

		Parent p = new Parent();
		System.out.println(p.s);
		
		Child c = new Child();
		System.out.println(c.s);

		Parent p1 = new Child();
		System.out.println(p1.s);
	}
}