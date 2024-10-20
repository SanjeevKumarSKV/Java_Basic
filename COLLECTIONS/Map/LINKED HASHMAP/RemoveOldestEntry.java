import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class RemoveOldestEntry {
	public static void main(String args[]) {
		LinkedHashMap<Integer,String> s = new LinkedHashMap<> ();
		
		s.put(1,"one");
		s.put(2,"two");
		s.put(3,"three");
		System.out.println(s);
		
		removeold(s);
		System.out.println(" REMOVE OLDEST ENTRY " +s);
	}
	public static void removeold(LinkedHashMap<Integer,String> s) {
		Iterator <Map.Entry<Integer,String>> iterator = s.entrySet().iterator();
		
		if(iterator.hasNext()){
			Map.Entry<Integer,String> entry = iterator.next();
			iterator.remove();
		}
	}
}
		