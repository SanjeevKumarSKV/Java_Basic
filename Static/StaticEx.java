package STATIC;

class Statics{
				static String name = " sk ";
				
				public static void run(){
					System.out.println(" no ");
				}
}
public class StaticEx {
						public static void main(String[] args) {
							Statics s = new Statics();
							s.run();
						}
						static {
								System.out.println(" brand");
							}
					}