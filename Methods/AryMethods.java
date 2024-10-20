public class AryMethods {
					public static void main(String args[])
					{
						int a[]={10,20,30,40,50,60,70};
						int sum=array(a);
						
						System.out.println(" result "+sum);
					}
					public static int array(int a[])
					{
						int s=0;
						for (int i=0; i<a.length; i++)
						{
							s=s+a[i];
						}
						return s;
					}
}
					