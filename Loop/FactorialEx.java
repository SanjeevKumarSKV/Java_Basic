import java.util.*;
public class FactorialEx{
					public static void main( String args[])
					{
						Scanner sk=new Scanner(System.in);
						System.out.println("enter the number");
						int f=sk.nextInt();
						int fact=1;
						for( int i = 1; i <= f; i++)
						{
							fact=fact*i;
							
							System.out.println(+fact);
							
						}
					}
				}