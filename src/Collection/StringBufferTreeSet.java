package Collection;

import java.util.Set;
import java.util.TreeSet;
//import java.util.SBComparator;

public class StringBufferTreeSet{
	public static void main(String[] args) {
		
		//Set<StringBuffer> set = new TreeSet<>();
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("nop"));

		for (StringBuffer obj : set) {
			System.out.println(obj);
		}

	}
}