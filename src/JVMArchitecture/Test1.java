package JVMArchitecture;

import java.lang.reflect.Method;

public class Test1{
	public static void main(String[] args) throws ClassNotFoundException {
		
	 	Class c =Class.forName("User");

	 	 Method[] methods = c.getDeclaredMethods();

	 	 for (Method method : methods ) {
	 	 		System.out.println(method.getName());
	 	 }
	 	 System.out.println(methods.length);
	}
}