package Inheritance;

class parent{
	int a,b;
	parent(int a,int b){
		this.a = a;
		this.b = b;
	}
	void f1(){
		System.out.println("This is Parent class Method f1");
	}
}
class child extends parent {
	int c,d; 
	child(int a,int b,int c,int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}
	void display(){

		System.out.println("Parent A "+super.a);
		System.out.println("Parent B "+super.b);
		System.out.println("Child C "+this.c);
		System.out.println("Child D "+this.d);

	}

	void f1(){
		//System.out.println(this);
		System.out.println("This is child class Method f1");
		super.f1();
	}

}

public class SuperKeyWordTest{
	public static void main(String[] args) {
		child c = new child(40,50,10,20);
		//c.f1();
		c.display();
	}
}