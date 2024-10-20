class parant{
				String name ;
				int age ;
				
				 parant(String name , int age){
					this.name = name;
					this.age = age;
				}
				public void check(){
					System.out.println(" name " +this.name+ " age " +this.age);
				}
				
			}
class child extends parant{
				String color;
				
				child(String name , int age , String color){
					super(name,age);
					this.color = color;
				}
				public void check(){
					System.out.println(" name " +this.name+ " age " +this.age+ " color " +this.color);
				}
				
			}
				
public class UpCastDownCast{
					public static void main(String args[]){
						parant m = new child(" sanjeev ",20," white ");
						m.check();
					
						
						child s = (child)m;
						s.name = " nikesh ";
						
						s.check();
					}
				}
						