import java.util.*;
public class WhileLoopEx{
					public static void main(String args[])
					{
						Scanner sk=new Scanner(System.in);
						System.out.println("enter the number");
						int n=sk.nextInt();
						int count=0;
						
						while(n>0)
						{
							n/=1;
							count++;
						}
						System.out.println(" number of digits "+count);
					}
				}