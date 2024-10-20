import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String args[]){
		TreeMap<Integer , String> sk = new TreeMap<> ();
		
		sk.put(2," nitish ");
		sk.put(1," nikesh ");
		sk.put(3," sanjeev ");
		
		System.out.println(sk);
	}
}