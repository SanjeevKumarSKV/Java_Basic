public class StringBuilderEx{
							public static void main(String args[]){
								String array[] ={"hello","sk"}; 
								
								StringBuilder s=new StringBuilder();
								
								for(String str:array){
									s.append(str);
								}
								String sk=s.toString();
								System.out.println(sk);
							}
						}