class vehical{
				String name = "ferrrai";
				String color = "red";
				int wheel = 4;
				
				public vehical( String name, String color, int wheel){
					this.name = name;
					this.color = color;
					this.wheel = wheel;
					
					System.out.println(" parant 3 perameter constructor ");
					
				}
				public vehical(int wheel){
					this.wheel=wheel;
					
					System.out.println(" parent 1 perameter constructor ");
				}
				
				public vehical(){
					System.out.println(" parant no-arg constructor ");
				}
				
				public vehical(String name ,String color){
					this.name = name;
					this.color = color;
					
					System.out.println(" parant 2 perameter constructor ");
				}
				
				public vehical(String name){
					this.name = name;
					
					System.out.println(" parant 1 perameter constructor ");
				}
				
				public void display(){
					System.out.println(" name "+this.name+" color "+this.color+" wheel "+this.wheel);
				}
				
				public void run(){
									System.out.println(" vehical is running ");
				}
				
				public String toString() {
					return "Car{" +"name='" + name + '\'' +
									", wheel=" + wheel +
									", color='" + color + '\'' +
									'}';
				}
			}
class car extends vehical{
							String type = "race car";
						
						public car(String name ,String color,int wheel,String type){
							super(name,color,wheel);
							this.name = name;
							this.color = color;
							this.wheel = wheel;
							this.type = type;
							
							
							System.out.println(" child 4 perameter constructor ");
						}
						public car(){
							System.out.println(" child no-args constructor ");
						}
						
						public car(String type){
							this.type = type;
							
							System.out.println(" constructor whith 1 perameter ");
							
						}
						public car(String name,String color){
							super(name,color);
							this.name = name;
							this.color = color;
							
							System.out.println(" child 2 perameter constructor ");
						}
						public car(String naame, String color ,int wheel){
							this.name=name;
							this.color = color;
							this.wheel = wheel;
							
							System.out.println(" child 3 perameter constructor ");
						}
						public car(int wheel){
							this.wheel = wheel;
							
							System.out.println(" child 1 perameter constructor ");
						}
						
						public void displaycar(){
							System.out.println(" name "+this.name+" color "+this.color+" wheel "+this.wheel+" type "+this.type);
						}
						
						public String toString() {
								return "Car{" + "name='" + name + '\'' +
														", wheel=" + wheel +
														", color='" + color + '\'' +", type='" + type + '\'' +'}';
						}
					}
public class InheritanceEx{
							public static void main(String args[]){
			
								car c  = new car();
								c.displaycar();
								c.run();
								System.out.println(c);
								
								car c1 = new car(" sports car ");
								c1.displaycar();
								c1.run();
								c1.display();
								System.out.println(c1);
								
								car c2 = new car(" bmw "," blue ");
								c2.displaycar();
								c2.run();
								System.out.println(c2);
								
								car c3 = new car(" audi "," black ",5);
								c3.displaycar();
								c3.run();
								System.out.println(c3);
								
								car c4 = new car(" bence "," white ",5," luxuiryes ");
								c4.displaycar();
								c4.run();
								System.out.println(c4);
								
								car c5 = new car(5);
								c5.displaycar();
								c5.run();
								System.out.println(c5);
								
							}
						}