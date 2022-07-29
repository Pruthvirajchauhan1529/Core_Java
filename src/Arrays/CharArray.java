package Arrays;

class CharArray{
	public static void main(String[] args) {
		
		char c[] = {'a','e','i','o','u','a'};
		if( c[0]== c[c.length - 1]){
			System.out.println("First and last elements are same");
		}else{
			System.out.println("They are different");
		}
	}
}