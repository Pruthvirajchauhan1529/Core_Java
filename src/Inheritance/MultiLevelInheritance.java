package Inheritance;

class parent
{	
	parent(){
		System.out.println("This is parent class Constructor "+this);
	}
	void p1(){
			System.out.println("This is the parent class method");
	}
}
class child extends parent{
	child(){
		System.out.println("This is the child class Constructor "+this);
	}
	void c1(){
		System.out.println("This is the child class method");
	}
}
public class MultiLevelInheritance extends child{
	public static void main(String[] args) {
		
		child ch = new child();
		//ch.p1();
		//ch.c1();
	}

}