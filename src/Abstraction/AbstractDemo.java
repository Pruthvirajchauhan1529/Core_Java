package Abstraction;

public class AbstractDemo{

	public static void main(String[] args) {
		
		//BMW b = new BMW();
		//b.commanFunc
		ThreeSeries ts = new ThreeSeries();
		ts.accelerate();
		ts.commanFunc();

		FiveSeries fs = new FiveSeries();
		fs.accelerate();
		fs.commanFunc();
	}
}