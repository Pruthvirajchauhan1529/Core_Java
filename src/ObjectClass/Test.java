package ObjectClass;

public class Test{
	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setFirstName("Pruthviraj");
		passenger.setLastName("Chauhan");
		System.out.println(passenger);
		System.out.println(passenger.hashCode()); 
	}
}