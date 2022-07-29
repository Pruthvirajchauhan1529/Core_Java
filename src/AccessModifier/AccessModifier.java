package AccessModifier;

class AccessModifier{


	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();

		//System.out.println(obj.a);
		//System.out.println(obj.b);
		//System.out.println(obj.c);
		//System.out.println(obj.d);

		B ab = new B();
			//System.out.println(ab.a);
			System.out.println(ab.b);
			System.out.println(ab.c);
			System.out.println(ab.d);
	}
}
class B{

		private int a = 10;
				int b = 20;
		protected int c = 30;
		public int d = 40;
}
/*Class C extends B(){

	AccessModifier obj1 = new AccessModifier();
	System.out.println(obj1.b);
	System.out.println(obj1.c);
	System.out.println(obj1.d);
}*/