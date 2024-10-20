import java.util.*;
public class StringEqualEx{
						public static void main(String args[])
						{
							String s=new String(" hello ");
							String s1=new String(" hello ");
							String s2=new String(" hello ");
							
							String s3="world";
							String s4="World";
							
							System.out.println(" s==s1 "+s==s1);
							System.out.println(" s2==s2 "+s1==s2);
							System.out.println(" s2==s3 "+s2==s3);
							System.out.println(" s3==s4 "+s3==s4);
							System.out.println(" s==s1 "+s.equals(s1));
							System.out.println(" s1==s2 "+s1.equals(s2));
							System.out.println(" s2==s3 "+s2.equals(s3));
							System.out.println(" s3==s4 "+s3.equals(s4));
							
						}
					}