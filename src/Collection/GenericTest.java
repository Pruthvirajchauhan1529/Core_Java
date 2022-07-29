package Collection;

public class GenericTest{
	public static void main(String[] args) {
		
		MyGenericClass<String> s = new MyGenericClass<>("ABHI");
		s.displayObjectDetails();
		System.out.println(s.getObject());

		MyGenericClass<Integer> i = new MyGenericClass<>(1234);
		i.displayObjectDetails();
		System.out.println(i.getObject());

		MyGenericClass<Double> d = new MyGenericClass<>(23.43);
		d.displayObjectDetails();
		System.out.println(d.getObject());
	}
}