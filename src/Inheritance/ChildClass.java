package Inheritance;

class SupperClass{

	int x;
	SupperClass(){

		System.out.println("No Arg Constructor for SupperClass");
	}
	SupperClass(int x){
		this();
		this.x = x;
		System.out.println("One Arg Constructor for SupperClass");
	}
}

public class ChildClass extends SupperClass{
	
	ChildClass(){
		this(10);
		System.out.println("No Arg Constructor for ChildClass");
	}
	ChildClass(int y){
		super(y);
		System.out.println("One Arg Constructor for ChildClass");
	}

	public static void main(String[] args) {
		ChildClass cl = new ChildClass();
	}

}