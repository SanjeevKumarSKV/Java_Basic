import java .util.*; 
public class FibEx{
					public static void main(String args[])
					{
						Scanner sk=new Scanner(System.in);
						System.out.println(" enter the number");
						int n=sk.nextInt();
						int n1=0;
						int n2=1;
						System.out.println("fib series of "+n);
						for(int i = 1; i <= n; i++)
							
						{
							
							System.out.println(+n1);
							int fb=n1+n2;
							n1 = n2;
							n2 = fb;
							
						  
							
						  
						}
					}
				}