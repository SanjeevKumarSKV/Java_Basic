import java.util.*;
public class StringOpEx{
					public static void main(String args[])
					{
						Scanner sk=new Scanner(System.in);
						System.out.println("enter the word ");
						String s=sk.nextLine();
						
						String a="sanjeev sk";
						String b="			sk			";
						String d="";
						String e="cat dog|dog";
						
						System.out.println("	JOIN	");
						String c=String.join(" ","sanjeev","sk","priyanka");
						System.out.println(c);
						
						
						System.out.println("	START AND END	");
						System.out.println(a.startsWith("sa"));
						System.out.println(a.endsWith("sk"));
						
						
						System.out.println("	CASE	");
						System.out.println(s.toUpperCase());
						System.out.println(s.toLowerCase());
						
						
						System.out.println("	REPLACE	");
						System.out.println(a.replace("e","x"));
						System.out.println(a.replaceAll(a,"priyanka"));
						System.out.println(a.replaceFirst(a,"sk"));
						
						
						
						System.out.println("	LENGTH	");
						System.out.println(s.length());
						
						
						System.out.println("	TRIM	");
						System.out.println(b.trim());
						
						
						System.out.println("	EMPTY	");
						System.out.println(a.isEmpty());
						System.out.println(d.isEmpty());
						
						
						System.out.println("	CONCAT	");
						System.out.println(a.concat(b));
						
						
						System.out.println("	INDEX	");
						System.out.println(a.indexOf("sk"));
						System.out.println(a.lastIndexOf("sanjeev"));
						
						
						System.out.println("	SUB STRING	");
						System.out.println(a.substring(6,9));
						
						
						System.out.println("	SUB SEQUENCE	");
						System.out.println(a.subSequence(5,8));
						
						
						System.out.println("	STRING PRINT	");
						System.out.println(a.toString());
						
						
						System.out.println("	CONTAINS	");
						System.out.println(a.contains("sk"));
						System.out.println(a.contains("nooo"));
						
						
						System.out.println("	CHANGE ARRAY FORMATE	");
						char z[]=a.toCharArray();
						System.out.println(z[2]);
						
						System.out.println("	MATCHES		");
						System.out.println("cat dog".matches(e));
						System.out.println("dog".matches(e));
						System.out.println("priyanka".matches(e));
					
					}
					
				} 