package HashSet;

import java.util.HashSet;
public class HashSetTest {
	public static void main(String args[]) {
		HashSet<String> s = new HashSet<> ();
		
		s.add("hello 1");
		s.add("hello 2");
		s.add("hello 3");
		s.add("hello 4");
		
		System.out.println(s);
		
		String newelement = "hello 5";
		
		s.add(newelement);
		System.out.println(s);

		s.clear();
		System.out.println(" EMPTY " +s);

		int size = s.size();
		System.out.println(" SIZE " +size);
	}
}