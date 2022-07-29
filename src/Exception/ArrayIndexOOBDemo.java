package Exception;

public class ArrayIndexOOBDemo{
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		System.out.println("Enter of the array are : ");
		try{
		for (int i=0; i<=arr.length ; i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
	catch(Exception e){
		System.out.println(e);
		}
		System.out.println("After Array output");	
	}
	void method1(){
		System.out.println("method 1");	
	}
}