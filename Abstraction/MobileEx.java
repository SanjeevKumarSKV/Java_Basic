abstract class mobiles{
						abstract void display();
						abstract void speaker(); 
					}
					
class iphone extends mobiles{
								void display(){
									System.out.println(" iphone diaplay was changed ");
								}
								void speaker(){
									System.out.println(" iphone speaker is fixed ");
								}
							}
class samsung extends mobiles{
	void display(){
		System.out.println(" samsung diaplay was changed ");
	}
	void speaker(){
		System.out.println(" samsung speaker is fixed ");
	}
}
class vivo extends mobiles{
	void display(){
		System.out.println(" vivo diaplay was changed ");
	}
	void speaker(){
		System.out.println(" vivo speaker is fixed ");
	}
}
class mobilerepair{
	public static void repair(){
		System.out.println("mobile was repair");
	}

}

public class MobileEx {
	public static void main(String args[]) {

		mobiles y = new iphone();
		y.display();
		y.speaker();

								
								
							mobiles x = new samsung();
								x.display();
								x.speaker();
							
							mobiles z = new vivo();
								z.display();
								z.speaker();
								
							mobiles m = new iphone();
								mobilerepair.repair();
								m.display();
								
							m = new vivo();
								mobilerepair.repair();
								m.display();
						
						}
						
						
					}