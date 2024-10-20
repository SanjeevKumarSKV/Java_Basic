import java.util.*;
public class ReverseNumberEX {
						public static void main(String args[])
						{
							Scanner sk=new Scanner(System.in);
							System.out.println("enter the number");
							int n=sk.nextInt();
							
							for(int i=n; i>=0; i--)
							{
								System.out.println(+i);
							}
						}
					}