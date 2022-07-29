package InnerClasses;

class OuterCase8{
	public void m1(){
		final int x = 10;
		class Inner{
			public void m2(){
				System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		OuterCase8 c = new OuterCase8();
		c.m1();
	}
}