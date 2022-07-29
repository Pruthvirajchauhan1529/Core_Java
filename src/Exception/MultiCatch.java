package Exception;

public class MultiCatch{
	public static void main(String[] args) {
		
		try{
			String input = args[2];
			System.out.println("Input is : "+ input);
			int output =Integer.parseInt(input);
			System.out.println("Output is : "+output);

		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			System.out.println(e);
		}
		// catch(NumberFormatException e){
		// 	System.out.println(e);
		// }
		finally{
			System.out.println("finally block ");
		}
		System.out.println("more code can go here");
	}
}

/*import java.util.Scanner;
 
public class practise
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}*/