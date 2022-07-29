package String;

class StringReverse{
	public String firstway(String actual){
		String reverse = "";
		for (int i=actual.length();i>0 ;i-- ) {
			reverse = reverse+actual.charAt(i-1);
		}
		return reverse;
	}

	public String SecondWay(String actual){
		byte[] s1 = actual.getBytes();
		byte[] s2 = new byte[s1.length];

		for (int i=0; i<s1.length; i++) {
			s2[i] = s1[s1.length-i-1];
		}
		String reverse = new String(s2);

		return reverse;

	}
	public static void main(String[] args) {
		String str = "Pruthviraj";
		StringReverse sr = new StringReverse();
		System.out.println(sr.firstway(str));
		System.out.println(sr.SecondWay(str));
	}
}