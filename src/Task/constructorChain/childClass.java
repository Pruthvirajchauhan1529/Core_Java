package Task.constructorChain;

public class childClass extends CostructorChaining{

	childClass(){
		
		System.out.println("No arg childClass Constructor");
	}
	/*childClass(int a){
		
		System.out.println("One arg childClass Constructor");
	}*/

	public static void main(String[] args) {
		childClass c = new childClass();
	}
}