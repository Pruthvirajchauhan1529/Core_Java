package Exception;

public class StringParser{
	public static void main(String[] args) {
		String s = "abcd";
		try{
			int i = Integer.parseInt(s);	
		}
		catch(Exception e){
			System.out.println(e);
		}
	
		System.out.println("acaacacdassdd");
	}	
}