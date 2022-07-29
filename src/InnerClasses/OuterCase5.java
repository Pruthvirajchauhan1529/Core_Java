package InnerClasses;

class A{
	class B{
		public void m2(){
			System.out.println("Inner Class m2 Method");
		}
		class C{
			public void m1(){
				System.out.println("Inner nested Class Method");
			}
		}
	}
}
class OuterCase5{
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.m2();
		A.B.C c = b.new C();
		c.m1();
	}
}