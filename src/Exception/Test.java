package Exception;

public class Test{

	static ArrayIndexOOBDemo a;
	public static void main(String[] args) {
		//ArrayIndexOOBDemo a = new ArrayIndexOOBDemo();
		// a.method1();
		try{
			Test.a.method1();	
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("After ArrayIndexOutOfBoundsException generated"); 
	}
}