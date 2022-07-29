package InnerClasses.localinner;

class OuterLocalInner{
	
	void f1(){
		System.out.println("Inside Outers f1()");

		class LocalInner{
			void f2(){
				System.out.println("Inside LocalInner f2()");
			}
		}
		LocalInner li = new LocalInner();
		li.f2();
	}

	public static void main(String[] args) {
		
		OuterLocalInner outer = new OuterLocalInner();
		outer.f1();
	}
}