class birds {
			String name = " sparrow ";
			int wings = 2 ;
			String color = " brown ";
			
			birds(String name , int wings , String color){
				
				System.out.println(" argument ");
				this.name = name;
				this.wings = wings;
				this.color = color;
			}
			
			birds(){
				System.out.println(" no arugument ");
			}	
			
			
		public void fly(){
						System.out.println(" name " +this.name+ " wings " +this.wings+ " color " +this.color);
					}
		}
		
public class ConstructorEx{
				public static void main (String args[]){
					
					birds b = new birds();
					b.name = " parrot ";
					b.color = " green ";
					b.fly();
					
					birds b1 = new birds(" pecock ",2," violet ");
					b1.fly();
					
					birds b2 = new birds();
					b2.fly();
				}
			} 