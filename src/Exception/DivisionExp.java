package Exception;

import java.util.Scanner;

public class DivisionExp{
	public static void main(String[] args) {
		int a,b,c;

		System.out.println("Enter two number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		try{
			c = a/b ;	
			System.out.println("Result "+c);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally Block");
		}
		System.out.println("More code can go here");
	}
}