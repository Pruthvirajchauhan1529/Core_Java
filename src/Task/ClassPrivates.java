package Task;//private class ClassPrivates
/*final class A {
	void display(){
		System.out.println("This is display Method");
	}
}*/

static class A{
	static void display(){
		System.out.println("This is display Method");
	}
}
class ClassPrivates extends A{
	
	void Show(){
		System.out.println("This Show Method");
	}

	public static void main(String[] args) {
		ClassPrivates cp = new ClassPrivates();
		cp.Show();	
	}
}
//ClassPrivates.java:1: error: modifier private not allowed here
//private class ClassPrivates{

/*
ClassPrivates.java:7: error: cannot inherit from final A
class ClassPrivates extends A{
                            ^*/