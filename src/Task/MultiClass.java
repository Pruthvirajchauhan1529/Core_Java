package Task;

public class A{
	void Show(){
		System.out.println("This Show Method");
	}
}
public class B{
	void Display(){
		System.out.println("This is Display Method");
	}
}
public class MultiClass{
	public static void main(String[] args) {
		A a = new A();
		a.Show();

		B b = new B();
		b.Display();
	}
}

/*MultiClass.java:1: error: class A is public, should be declared in a file named A.java
public class A{
       ^
MultiClass.java:6: error: class B is public, should be declared in a file named B.java
public class B{
       ^
2 errors
*/