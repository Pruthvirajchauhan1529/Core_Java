package InnerClasses.staticinner;

public class Outer2{

	public void f1(){
		System.out.println("Outer2 class non static method");
	}

	class Inner{

		void f2(){
			System.out.println("Inner class non static method");
		}

		class AB{
			void f3(){
				System.out.println("Inner in AB Inner class non static method");
			}
		}

	}
	public static void main(String[] args) {
		
		Outer2 ot = new Outer2();
		ot.f1();

		Inner oi = ot.new Inner();
		oi.f2();

		Inner.AB ab = oi.new AB();
		ab.f3();
	}	
}