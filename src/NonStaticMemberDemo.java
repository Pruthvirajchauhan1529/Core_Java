class NonStaticMemberDemo{
	int num;
	NonStaticMemberDemo(){
		System.out.println("This is the constructor");
	}

	{
		System.out.println("This is the non static block");
	}

	public static void main(String[] args) {

		System.out.println("this is the main method");
		  NonStaticMemberDemo obj = new NonStaticMemberDemo();
		  obj.doSomthing();
		  //new NonStaticMemberDemo();

	}

	static{
		System.out.println("This is the static block");
	}

	void doSomthing(){
		System.out.println("Do Somethings");
	}
}