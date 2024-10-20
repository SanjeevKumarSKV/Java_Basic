import java.util.LinkedList;
import java.util.Collections;
public class ReveresLinkedList{
				public static void main(String args[]){
					
					LinkedList<Integer> z = new LinkedList<> ();
					
					z.add(10);
					z.add(20);
					z.add(30);
					z.add(40);
					z.add(50);
					z.add(60);
					z.add(70);
					
					System.out.println(z);
					System.out.println(" REVERSE ");
					
					for(int i=z.size()-1; i>=0; i--){
						System.out.println(z.get(i));
					}
					Collections.reverse(z);
					
					System.out.println(z);
					
				
				}
			}