package InnerClasses.Anonymous;

class OuterStaticDemo3{
	int i =10;
	static j = 20;
	static class nested{
		public void m1(){
			System.out.println(x);
			//CE :- non-Static variable x cannot be referenced from a static context
			System.out.println(y);
		}
	}
}