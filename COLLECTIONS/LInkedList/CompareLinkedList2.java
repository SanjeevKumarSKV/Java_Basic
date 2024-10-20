import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;

public class CompareLinkedList2{

    public static void main(String[] args) {
  
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);
		
		 LinkedList<Integer> list3 = new LinkedList<>();
		 
		 for(int s:list1)
			list3.add(list2.contains(s)? 1:0);
			
			System.out.println(list3);
			
			
			
			System.out.println(list1);
			
	}
}