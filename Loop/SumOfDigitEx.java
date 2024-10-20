import java.util.*;
public class SumOfDigitEx{
					public static void main(String arge[])
					{
						Scanner sk=new Scanner(System.in);
						System.out.println(" enter the number ");
						int n=sk.nextInt();
						int sum=0;
						for( int i=1; i<=n; i++)
						{
							sum=sum+i;
						}
						System.out.println(" sum is "+sum);
					}
				}