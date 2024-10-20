import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedHashMaps {
	public static void main(String args[]){
		LinkedHashMap<Integer , String> sk = new LinkedHashMap<> ();
		
		sk.put(1," sanjeev ");
		sk.put(2," nikesh ");
		sk.put(3," nitish ");
		
		System.out.println(sk);
	}
}