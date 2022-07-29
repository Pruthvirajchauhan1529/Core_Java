package Task.Exception;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
		
	YoungerAgeException(String msg){
		super(msg);
	}
}
public class Voting{
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :- ");
		 a =sc.nextInt();

		 if(a<18){
		 	System.out.println("hellooooo");
		 	throw new YoungerAgeException("You are not eligibal for votting");
		 	//throw new YoungerAgeException();
		 }
		 else{
		 	System.out.println("You are eligibal for voting");
		 }
		 System.out.println("Today is votting day");
	}
} 


// 14
// Exception in thread "main" YoungerAgeException: You are not eligibal for votting
//         at Voting.main(Voting.java:17)