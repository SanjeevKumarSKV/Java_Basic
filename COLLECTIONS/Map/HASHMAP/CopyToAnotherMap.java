import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class CopyToAnotherMap {
	public static void main(String args[]) {
		HashMap<Integer,String> s = new HashMap<Integer,String> ();
		
		s.put(1,"lion");
		s.put(2,"tiger");
		s.put(3,"fox");
		System.out.println("HASH MAP LIST" +s);
		
		LinkedHashMap<Integer,String> sk = new LinkedHashMap<> (s);
		System.out.println(" COPY MAP TO ANOTHER MAP " +sk);
	}
}