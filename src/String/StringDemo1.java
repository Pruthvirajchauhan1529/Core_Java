package String;

class StringDemo1{
	public static void main(String[] args) {
		String s1 = "Five";

		String s2 = new String("Six");

		char c[] = {'P','r','u','t','h','v','i','r','a','j'};

		String s3 = new String(c);

		byte b[] = {65,66,67,68};

		String s4 = new String(b);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}
}