package Task;

class Contructors{
	private Contructors(){
		System.out.println("Private Contructors");
	}

	// static Contructors(){
	// 	System.out.println("Static Contructors");
	// }

	/*final Contructors(){
		System.out.println("FInal Contructors");
	}*/

	// protected Contructors(){
	//	System.out.println("this is protected Contructors");
	//}

	void show(){
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		Contructors c = new Contructors();
		c.show();
	}
}
/*
Contructors.java:6: error: modifier final not allowed here
        final Contructors(){
a constructor can not be made final*/

/*Contructors.java:6: error: modifier static not allowed here
        static Contructors(){
               ^
1 error
*/