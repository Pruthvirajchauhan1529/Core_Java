class ImplicitCast{
	public static void main(String[] args) {
		byte b = 20;
		int i = b;

		System.out.println(i);

		char c = 'B';
		int d = c;
		byte h = 10;
		System.out.println(d);
		byte j = (byte)(b+h);
		System.out.print(j);
	}
}