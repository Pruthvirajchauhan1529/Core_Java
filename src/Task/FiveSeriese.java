package Task;

class FiveSeriese extends AUDI{

	void accelerate(){
		System.out.println("Inside FiveSeriese accelerate method");
	}

	public static void main(String[] args) {
		
		ThreeSeries ts = new ThreeSeries();
		ts.accelerate();
		ts.commanFunc();
		System.out.println("----------------------------------------");	
		FiveSeriese fs = new FiveSeriese();
		fs.accelerate();
		fs.commanFunc();
	}
}