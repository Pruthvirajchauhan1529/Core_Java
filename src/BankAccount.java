class BankAccount{

	static String bankName = "Bank Of Baroda";
	String accountHoldersName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		double lonInterestRate = 7.1;
		System.out.println(lonInterestRate);

		System.out.println(BankAccount.bankName);

		BankAccount ba= new BankAccount();
		ba.accountHoldersName="Pruthviraj";
		ba.accountNumber = "1234564321";
		ba.balance = 1000222.40f;

		System.out.println(ba.accountHoldersName+" "+ba.accountNumber+" "+ba.balance);

	}
}