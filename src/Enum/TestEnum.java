package Enum;

public class TestEnum{
	public static void main(String[] args) {
		
		PaymentType pt = PaymentType.CREDITCARD;
		//System.out.println(pt);

		PaymentType[] PaymentTypes = PaymentType.values();
		for (PaymentType payment : PaymentTypes ) {

			System.out.println(payment);
			System.out.println(payment.ordinal());
			System.out.println(payment.getFee()); 	
		}
	}
} 