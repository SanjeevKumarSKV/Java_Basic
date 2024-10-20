import java.util.*;

public class TreeSets {
	public static void main(String args[]){
		Set<Integer> sk = new TreeSet<> ();
		
		sk.add(10);
		sk.add(10);
		sk.add(20);
		sk.add(20);
		sk.add(30);
		sk.add(40);
		sk.add(50);
	
		System.out.println(sk);
		int size = sk.size();
		System.out.println(" SIZE " +size);

		sk.clear();
		System.out.println(" Clear " +sk);
	}
}