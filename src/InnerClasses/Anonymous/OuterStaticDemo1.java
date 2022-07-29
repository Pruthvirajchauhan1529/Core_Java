package InnerClasses.Anonymous;

class OuterStaticDemo1{
	static class nested{
		public void m1(){
			System.out.println("static nested class method");
		}
	}
	public static void main(String[] args) {
		nested n = new nested();
		n.m1();
	}
}