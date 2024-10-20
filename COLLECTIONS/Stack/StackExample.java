import java.util.Stack;
public class StackExample{
			public static void main(String[] args){
				Stack<Integer> s = new Stack<> ();
				
				s.push(1);
				s.push(2);
				s.push(3);
				s.push(4);
				
				System.out.println(s);
				
				System.out.println(" PEEK "+s.peek());
				
				System.out.println(" POP " +s.pop());
			
				System.out.println(s);
				
				for(int i=0; i<=s.capacity(); i++){
					if(!s.empty()){
						System.out.println(" POP "+s.pop());
					}
				}
				System.out.println(s);
			}
		}