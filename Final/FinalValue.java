class vivo{
			final String model = "t2" ;
			final int price = 20000;
			
			
			
			
			public final void purchas(){
				System.out.println(" final value ");
			}
			public void check(){
				System.out.println("model " +this.model+ " price " +this.price);
			}
		}
public class FinalValue{
						public static void main(String args[]){
							vivo v = new vivo();
							
							v.check();
							v.purchas();
						
						}
					}