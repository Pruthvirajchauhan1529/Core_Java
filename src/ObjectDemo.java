class ObjectDemo{

	static ObjectDemo obj;
	static {
		
		System.out.println(ObjectDemo.obj);
		ObjectDemo.obj = new ObjectDemo();
		
	}
	public static void main(String[] args) {
		System.out.println(ObjectDemo.obj);
	}
}