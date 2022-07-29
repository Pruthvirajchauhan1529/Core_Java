package Controlflow;

class IfElseDemo{
	public static void main(String[] args) {
		int x =100, y =90;
		if(x > y){
			System.out.println("X is greater");
		}else if(y > x){
			System.out.println("Y is greater");
		}
		else{
			System.out.println("Both are the same");
		}
	}
}