package MultiThreading;

public class SingleThreaded{
	public static void main(String[] args) {
		
		SingleThreaded st = new SingleThreaded();
		st.printNumber();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		for (int j=1;j<=100 ;j++ ) {
			System.out.print("J : "+j +"\t");
		}

	}
	void printNumber(){
		for (int i =1;i<=100 ;i++ ) {
			System.out.print("I : "+i +"\t");	
		}
	}
}