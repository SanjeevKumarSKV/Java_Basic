 import java.util.*;
public class MethodEx{
						public static void main(String args[])
						{
							Scanner sk=new Scanner(System.in);
							System.out.println("enter the number ");
							
							int a=sk.nextInt();
							int b=sk.nextInt();
							
							int s = add( a , b );
							System.out.println("  add  "+s);
							
							s = sub( a , b );
							System.out.println("  sub  "+s);
							
							s = multi( a , b );
							System.out.println("  multi  "+s);
							
							s = div( a , b );
							System.out.println("  div  "+s);
					
						}
						
						public static int add(int a, int b)
						{
							int s = a + b ;
							return s;
						}
						public static int sub(int a, int b)
						{
							int s = a - b ;
							return s;
						}
						public static int multi(int a, int b)
						{
							int s = a * b ;
							return s;
						}
						public static int div(int a, int b)
						{
							int s = a / b ;
							return s;
						}
					}