package Controlflow;

class Switch1{
	public static void main(String[] args) {
		
		String choice="Check Balance";

		switch(choice){
			case "Check Balance":
				System.out.println("Check Balance");
				break;
			case "Change pin":
				System.out.println("Change pin");
				break;
			case "Withdraw cash":
				System.out.println("Withdraw cash");
				break;
			case "Deposite check":
				System.out.println("Deposite check");
				break;
			default :
				System.out.println("Time Out");
			}
	}
}