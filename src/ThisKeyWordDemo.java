class ThisKeyWordDemo
{
	int x=132;

	ThisKeyWordDemo(){
		System.out.println(this);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		new ThisKeyWordDemo();
		new ThisKeyWordDemo();
	}
}