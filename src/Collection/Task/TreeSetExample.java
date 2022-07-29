package Collection.Task;

import java.util.*;

public class TreeSetExample{
	public static void main(String[] args) {
		
		Set<Book> set = new TreeSet<Book>();

		Book b1 = new Book(121,"Let Us C","Yashwant Kanetkar","BPB",8);
		Book b2 = new Book(122,"Operating System","Galvin","Wiley",6);
		Book b3 = new Book(123,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);	
		Book b4 = new Book(122,"Operating System","Galvin","Wiley",6);

		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);

		for (Book b : set ) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}	