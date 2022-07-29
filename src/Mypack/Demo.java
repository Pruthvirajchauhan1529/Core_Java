package Mypack;

class A{
 	A(){
 		System.out.println("A constructors");
 	}
	void show()
	{
		System.out.println("Hello");
	}
	public static void show1()
	{
		System.out.println("inside Package");
	}
}


public class Demo
{
	 public static void main(String[] args) {
	 	
	 	A.show1();
	 	A a=new A();
	 	a.show();
	 }
}