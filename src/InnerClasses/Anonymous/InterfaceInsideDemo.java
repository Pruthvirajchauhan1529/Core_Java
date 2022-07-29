package InnerClasses.Anonymous;

interface Outer{
	public void m1();
	interface Inner{
		public void m2();
	}
}
class Test1 implements Outer{
	public void m1(){
		System.out.println("outer interface method implementation");
	}
}
class Tesr2 implements Outer.Inner{
	public void m2(){
		System.out.println("Inner interface method implementation");
	}
}

class InterfaceInsideDemo{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		Tesr2 t2 = new Tesr2();
		t2.m2();
	}
}