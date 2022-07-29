package Task.interfaces;

public abstract class ABC implements AB{
	public static void main(String[] args) {
		
		System.out.println("This is Main method");
		// ABC a = new ABC();
		// a.display();
	}
	public void display(){
		System.out.println("This display method");
	}
}

// interfaces\ABC.java:3: error: ABC is not abstract and does not override abstract method sub() in AB
// public class ABC implements AB{
//        ^
// 1 error