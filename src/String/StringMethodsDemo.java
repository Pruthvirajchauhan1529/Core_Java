package String;

class StringMethodsDemo{
	public static void main(String[] args) {
		String s1 = "Hello world";

		System.out.println("Lenth of the String : "+s1.length());
		System.out.println("Index of String : "+s1.indexOf('l'));
		System.out.println("charAt : "+s1.charAt(2));

		System.out.println("SubString with beginning index : "+s1.substring(2));
		System.out.println("SubString with begin and End index : "+s1.substring(0,3));

		String[] result = s1.split(" ");
		for (int i=0; i<result.length;i++ ) {
			System.out.println(result[i]);	
		}

		System.out.println("Replace : "+s1.replace('l','p'));
		System.out.println("UpperCase : "+s1.toUpperCase());
		System.out.println("LowerCase : "+s1.toLowerCase());
	}
}