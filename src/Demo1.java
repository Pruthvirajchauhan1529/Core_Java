class Demo1{
	static int i=100;

	int j=200;

	Demo1(){
		System.out.println("This Demo1 Constructor");
	}
	static void show(){
		Demo1 d = new Demo1();
		System.out.println("This is Instance variavle "+d.j);
		System.out.println("This is Static Show method");
	}

	{
		System.out.println("This is Non Static Method");
	}
	void display(){
		//Demo1.i;
		
		Demo1.show();
		System.out.println("This is Instance Method display");
	}

	public static void main(String[] args) {
		
		Demo1.show();

		Demo1 d = new Demo1();
		d.display();
	}
}