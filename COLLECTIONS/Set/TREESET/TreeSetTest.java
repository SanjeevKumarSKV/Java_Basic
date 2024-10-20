package TREESET;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest{
	public static void main(String args[]) {
		TreeSet<Integer> s = new TreeSet<> ();
		
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(50);
		s.add(40);
		System.out.println(" LIST "+s);
		
		TreeSet<Integer> sk = s;
	
		System.out.println(" COPYED LIST" +sk);

		int sk1= 30;
		boolean sk2 = s.remove(sk);

		if(sk2){
			System.out.println("  ELEMENT IS REMOVE " +sk);
		}
		else{
			System.out.println( sk+ " ELEMENT IS NOT FOUND ");
		}
		System.out.println(s);


		System.out.println(" REMOVE LAST ELELMEMT " +s.pollLast());
		System.out.println(s);

		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext()) {
			System.out.println("ITERATOR " +iterator);
		}
		for(int s1 : s) {
			System.out.println(s1);
		}
	}
}