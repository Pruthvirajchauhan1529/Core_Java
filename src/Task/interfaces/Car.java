package Task.interfaces;

public interface Car{
	
	// void go();
	// void stop();
	void Start();
	void service();
	default stop(){
		System.out.println("Inside Car interface of stop method");
	}
}