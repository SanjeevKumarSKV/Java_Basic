import java.util.*;
public class Matrix {
						public static void main(String args[])
						{
							Scanner sk=new Scanner(System.in);
							System.out.println("enter the number");
							
							int n1=sk.nextInt();
							int n2=sk.nextInt();
							
							int a[][]=new int[n1][n2];
							
							for(int i=0; i<n1; i++)
							{
								for(int j=0; j<n2; j++)
								{
									int s;
									
									a[i][j]=1;
									
									s=a[i][j];
									
									System.out.print(+s);
									
								}
								
								System.out.println();
							}
						}
						
					}
							