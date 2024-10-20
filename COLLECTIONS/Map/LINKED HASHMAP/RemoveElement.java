import java.util.LinkedHashMap;

public class RemoveElement {
	public static void main(String args[]) {
		LinkedHashMap<Integer,String> s = new LinkedHashMap<> ();

		s.put(1,"one");
		s.put(2,"two");
		s.put(3,"three");
		System.out.println(s);

		System.out.println(" REMOVE KEY AND VALUES " +s.remove(1,"one"));
		System.out.println(" REMOVE KEY " +s.remove(2));

		System.out.println(s);
	}
}