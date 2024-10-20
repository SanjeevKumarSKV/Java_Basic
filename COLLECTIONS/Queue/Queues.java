import java.util.Queue;
import java.util.ArrayDeque;

public class Queues {
	public static void main(String args[]){
		Queue<Integer> s = new ArrayDeque<> ();
		 
		 s.add(1);
		 s.add(2);
		 s.add(3);
		 s.add(4);
		 s.add(5);
		 s.add(6);
		 
		 System.out.println(s);
		 
		 System.out.println(" PEEK " +s.peek());
		 
		 System.out.println(" POLL " +s.poll());
		 
		 System.out.println(s);
	}
}
		 