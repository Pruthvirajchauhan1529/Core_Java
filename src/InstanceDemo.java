class InstanceDemo{
	int i=100;
	void demo(){
		System.out.println("This is Demo Method");
	}
	public static void main(String[] args) {
		InstanceDemo id = new InstanceDemo();
		System.out.println(id.i);
		id.demo();

	}
}