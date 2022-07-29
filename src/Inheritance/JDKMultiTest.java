package Inheritance;

class JDK6{
	JDK6(){
		System.out.println("Instantiating JDK6");
	}
}
class JDK7 extends JDK6{
	JDK7(){
		System.out.println("Instantiating JDK7");
	}
}
class JDK8 extends JDK7{
	JDK8(){
		System.out.println("Instantiating JDK8");
	}
}
class JDKMultiTest{
	public static void main(String[] args) {
		JDK8 jdk = new JDK8();
	}

}