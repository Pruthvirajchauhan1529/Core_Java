package Task.interfaces;

public interface Bike{

	void Start();
	void service();
	default stop(){
		System.out.println("Inside Bike interface of stop method");
	}
}