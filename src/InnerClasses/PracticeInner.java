package InnerClasses;

public class PracticeInner{
	class Inner{
		public void m1(){
			System.out.println("Inner class m1 method");
		}
	}
	public void m2(){
		Inner i = new Inner();
		i.m1();  
	}	
		public static void main(String[] args) {
			System.out.println("Outer class main method");

			PracticeInner o = new PracticeInner();
			//PracticeInner.Inner i = o.new Inner();
			//PracticeInner.Inner i1 = new PracticeInner().new Inner().m1();
			o.m2();
	}
}