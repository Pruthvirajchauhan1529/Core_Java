package String;

class SBDemo{
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Initail Capacity : "+sb.capacity());

		sb.append("All the power is with in you.");
		sb.append("You can do anything and everything.");
		sb.append("You are this best in the world.");

		System.out.println(sb);

		System.out.println("Current Capacity : "+sb.capacity());
		System.out.println("charAt : "+sb.charAt(25));

		StringBuffer sb1 = new StringBuffer("ABCDFG");

		System.out.println("Setring : "+sb1);

		System.out.println("Reverse : "+sb1.reverse());

		System.out.println("Insert : "+sb1.insert(2,"abc"));

		System.out.println("Delete : "+sb1.delete(2,6));
	}
}