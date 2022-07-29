package Polymorphism.Overloading;

class CompileTimeBinding {
	void add(int i,int j){
		int result;
		result = i+j;
		System.out.println("Result is "+result);
	}
	void add(float a, float b){
		float result;
		result = a+b;

		System.out.println("Result is "+result);
	}
	void add(int a, int b, int c){
		int result;
		result = a+b+c;
		System.out.println("Result is "+result);
	}

	public static void main(String[] args) {
		CompileTimeBinding cb = new CompileTimeBinding();
		cb.add(10, 20);
		cb.add(30f, 40f);
		cb.add(50, 60, 70);
	}
}