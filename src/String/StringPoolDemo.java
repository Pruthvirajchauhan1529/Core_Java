package String;

class User{
	int id;
	String name;
	User(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class StringPoolDemo{
	public static void main(String[] args) {
		User user1 = new User(1,"nikk");
		User user2 = new User(2,"nikk");

		System.out.println(user1);
		System.out.println(user2);

		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = "nnp";
		String s4 = new String("abcd");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));

		//System.out.println(user1 == user2);
		//System.out.println(user1.equals(user2));
	
	}
}