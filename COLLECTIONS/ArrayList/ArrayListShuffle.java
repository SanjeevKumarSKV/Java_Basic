import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle {
			public static void main(String args[]){
				
				ArrayList<Integer> s = new ArrayList<> ();
				
				s.add(10);
				s.add(20);
				s.add(30);
				s.add(40);
				s.add(50);
				s.add(60);
				s.add(70);
				s.add(80);
				s.add(90);
				
				System.out.println(" BEFORE SUFFLE ");
				System.out.println(s);
				
				Collections.shuffle(s);
				
				System.out.println(" AFFTER SUFFLE ");
				System.out.println(s);
			}
		}		

