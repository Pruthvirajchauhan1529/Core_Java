class StaticDemo{

	static int i;
	static{
		
		System.out.println(i);
		
		System.out.println("This is the Static Block");
	}
	static void show(){
		System.out.println("This is static method ");
	}
	public static void main(String[] args) {
		StaticDemo.show();
	}
}