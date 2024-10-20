import java.util.LinkedList;
import java.util.Collections;

public class SuffleLinkedList {
			public static void main(String args[]){
				
				LinkedList<String> v = new LinkedList<> ();
				
				v.add("sanjeev");
				v.add("nitish");
				v.add("nikesh");
				v.add("gokul nisanth");
				
				System.out.println(" BEFORE SHUFFLE ");
				System.out.println(v);
			
				System.out.println(" AFFTER SHUFFLE ");
				Collections.shuffle(v);
				
				System.out.println(v);
				
			}
		}
				