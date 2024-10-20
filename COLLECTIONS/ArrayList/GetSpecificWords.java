import java.util.ArrayList;
public class GetSpecificWords{
			public static void main(String args[]){
				ArrayList<String> s = new ArrayList<> ();
				
				s.add("sanjeev");
				s.add("nikesh");
				s.add("nitish");
				s.add("gokul nisanth");
				s.add("jegan");
				s.add("pradeep");
				s.add("udaya");
				
				System.out.println(s);
				System.out.println(s.get(3));
				System.out.println(s.get(4));
				System.out.println(s.get(5));
				System.out.println(s.get(6));
			}
		}