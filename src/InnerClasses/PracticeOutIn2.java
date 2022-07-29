package InnerClasses;

class PracticeOutIn2{
	
	int x =10;
	static int y =20;
	class Inner{
		public void m1(){
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
			
			// PracticeOutIn2.Inner i = new PracticeOutIn2().new Inner();
			// i.m1();
			new PracticeOutIn2().new Inner().m1();
		}	
	
}