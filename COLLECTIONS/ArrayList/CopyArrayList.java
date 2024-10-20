import java.util.ArrayList;
public class CopyArrayList{
			public static void main(String args[]){
			
			ArrayList<Integer> s = new ArrayList<> ();
				
				s.add(10);
				s.add(20);
				s.add(30);
				s.add(40);
				s.add(50);
				
				System.out.println(s);

				ArrayList<Integer> s1 = s ;
				
					s1.add(1);
					s1.add(2);
					s1.add(3);
					s1.add(4);
					s1.add(5);
					
					System.out.println(s1);
				
			}
		}