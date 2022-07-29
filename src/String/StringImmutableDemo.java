package String;

class User{
	int id;
	String name;
	User(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class StringImmutableDemo{
	public static void main(String[] args) {
		User user = new User(1,"Dhuti");
		System.out.println(user);

		String s = new String("Nikk");
		System.out.println(s);

		Integer i = new Integer(345);
		System.out.println(i);
	}
}