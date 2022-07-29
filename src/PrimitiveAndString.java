class PrimitiveAndString{
	public static void main(String[] args) {
		byte b = 100;

		String c =Byte.toString(b);
		byte d = Byte.parseByte(c);	
		System.out.println(d);
	}
	
}