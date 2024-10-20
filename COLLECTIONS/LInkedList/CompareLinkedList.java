import java.util.LinkedList;
import java.util.ListIterator;

public class CompareLinkedList {

    public static void main(String[] args) {
  
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean isEqual = compareLinkedLists(list1, list2);

        if (isEqual) {
            System.out.println("The LinkedLists are equal.");
        } else {
            System.out.println("The LinkedLists are not equal.");
        }
    }

    public static boolean compareLinkedLists(LinkedList<?> list1, LinkedList<?> list2) {
       
        if (list1.size() != list2.size()) {
            return false;
        }

        ListIterator<?> iterator1 = list1.listIterator();
        ListIterator<?> iterator2 = list2.listIterator();

       
        while (iterator1.hasNext() && iterator2.hasNext()) {
            Object obj1 = iterator1.next();
            Object obj2 = iterator2.next();

     
            if (!obj1.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}

