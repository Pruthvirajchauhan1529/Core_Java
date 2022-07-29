package Inheritance;

class vehicle{
	String fuel(){
		return "petrol";
	}
}
class car extends vehicle{
	String fuel(){
		return "diesel";
	}
}
class Bus extends vehicle{
	String fuel(){
		return "CNG";
	}
}
class Bike extends vehicle{

}

public class Hierarchicalvehicle{
	public static void main(String[] args) {
		car c = new car();
		System.out.println(c.fuel());
		Bike b = new Bike();
		System.out.println(b.fuel());

	}
}