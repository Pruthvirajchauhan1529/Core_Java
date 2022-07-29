package Task;

public abstract class AUDI{

	int x = 10;
	AUDI(){
		System.out.println(this.x);
		System.out.println("This is AUDI class constructor");
	}

	void commanFunc(){
		System.out.println("Inside commonFunc Method");
	}

	abstract void accelerate(); 

	/*public static void main(String[] args) {
	
		System.out.println("Inside main Method");	
		*/
	//	AUDI au = new AUDI();
	//	au.commanFunc();
	//}
}