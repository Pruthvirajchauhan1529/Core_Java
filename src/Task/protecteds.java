package Task;

protected class protecteds{
	
	void show(){

		System.out.println("Protected show method");
	}

	public static void main(String[] args) {
		
		protecteds ps = new protecteds();
		ps.show();
	}
}

/* protecteds.java:1: error: modifier protected not allowed here
protected class protecteds{
          ^
1 error
*/