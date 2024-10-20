import java.util.LinkedList;
public class FindMiddleNumber{

    public static void main(String[] args) {
  
        LinkedList<Integer> list = new LinkedList<>();
     

        list.add(1);
        list.add(2);
        list.add(3);
		
		System.out.println(list);
		 
		 Integer s = list.get(list.size()/2);
		 
		 System.out.println(s);
	}
}