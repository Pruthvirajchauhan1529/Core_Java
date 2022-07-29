package InnerClasses.Anonymous;

interface vehicle{
	public int getNoOfWheels();
	class DefaultVehicle implements vehicle{
		public int getNoOfWheels(){
			return 2;	
		}
	}
}
class Bus implements vehicle{
	public int getNoOfWheels(){
		return 6;
	}
}
class InterfaceInsideDemo2{
	public static void main(String[] args) {
		vehicle.DefaultVehicle d = new vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());//2

		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());//6
	}
}