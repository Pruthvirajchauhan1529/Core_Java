package Controlflow;

class IfElseLadder{
	public static void main(String[] args) {
		
		String  choice ="Deposite check";
		if(choice.equals("Check Balance")){
			System.out.println("Check Balance");
		}else if(choice.equals("Change pin")){
			System.out.println("Change Pin");
		}else if(choice.equals("Withdraw cash")){
			System.out.println("Withdraw Cash");
		}else if(choice.equals("Deposite check")){
			System.out.println("Deposite Check");
		}else {
			System.out.println("Time Out");
		}
	}
}