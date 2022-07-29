package Encapsulation;

public class TestEncap{
	public static void main(String[] args) {
		
		Customer c = new Customer();

		c.setFirstName("Pruthviraj");
		c.setLastName("Chauhan");
		c.setCreditCard("122344");

		System.out.println("First Name : " +c.getFirstName());
		System.out.println("Last Name : " +c.getLastName());
		System.out.println("CreditCard : " +c.getCreditCard());
	}

}