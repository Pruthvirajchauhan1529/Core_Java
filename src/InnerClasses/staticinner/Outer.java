package InnerClasses.staticinner;

public class Outer{

	static void f1(){
		System.out.println("Outer Static Method");
	}

	static class Inner{
		
		static void f2(){
			System.out.println("Inner static Method");
		}

		void f3(){
			System.out.println("Non static method Inside the Inner class");
		}
	}
	public static void main(String[] args) {
		
		Outer.f1();
		Inner.f2();
		Inner inner = new Inner();
		inner.f3();

	}
}