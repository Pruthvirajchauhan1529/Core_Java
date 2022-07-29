package Task.interfaces;

class Honda implements Car,Bike{
/*
	public void go(){
		System.out.println("Inside Honda Go");
	}
	public void stop(){
		System.out.println("Inside Honda Stop");
	}*/

	public void Start(){
		System.out.println("Inside Honda Bike Start");
	}
	public void service(){
		System.out.println("Inside Honda Bike in service");
	}
	
	public static void main(String[] args) {
		Honda ha = new Honda();
		ha.Start();
		ha.service();
		//ha.stop();
	}
}

/*interfaces\Honda.java:3: error: Honda is not abstract and does not override abstract method stop() in Car
class Honda implements Car,Bike{
^
1 error*/