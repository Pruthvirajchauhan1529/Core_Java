package InnerClasses.staticinner;

class OuterClassMember{

	private static int x = 50;
	private int y ;

	OuterClassMember(int y){
		this.y = y;
	}
	void f1(){
		System.out.println("Outer Classes non static method");
	}
	class Inner{
		private  int y;

		Inner(int y){
			this.y = y;
		}

		private void f2(){
			System.out.println("Outer Classes X "+OuterClassMember.x);
			System.out.println("Outer Classes X "+OuterClassMember.this.y);
			System.out.println("Inner Classes Y "+this.y);
		}
	}
	public static void main(String[] args) {
		OuterClassMember outer = new OuterClassMember(80);
		outer.f1();

		Inner inner = outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y);	
	}
}