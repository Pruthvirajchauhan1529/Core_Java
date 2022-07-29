class StaticMethodDemo{
	public static void main(String[] args) {
		
		System.out.println("Inside block");
		StaticMethodDemo.method1();
	}

	static void method1(){
		System.out.println("This is method1");
	}

	static{
		System.out.println("This is the static block");
		StaticMethodDemo.method1();
	}
}