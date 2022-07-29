package Task.Exception;

import java.util.Scanner;

class CustomeException extends RuntimeException{
		CustomeException(String msg){
			super(msg);
		}
}

public class Throwss{
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter Two value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		c = a/b;
		if(b==0){
			throw new CustomeException("Can not diveded by zero");
		}else{
			System.out.println("Result is "+c);	
		}
		System.out.println("Run Successfully");
	}
}