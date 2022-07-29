package Exception;

class TestException{

	public static void main(String[] args) throws CheckedCustomException {
		
		//throw new UncheckedCustomException("Business Exception occured");
		throw new CheckedCustomException("Business Exception that need to be handled");
	}
}

// TestException.java:6: error: unreachable statement
//                 throw new CheckedCustomException("Business Exception that need to be handled");
//                 ^
// 1 error