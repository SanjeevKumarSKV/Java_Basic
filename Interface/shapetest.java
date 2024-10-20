package INTERFACE;

interface shape{
			double getarea();
		}
		
		
class rectangle implements shape{
			private double with;
			private double height;
			
			rectangle(double with , double height){
				this.with = with;
				this.height = height;
			}
			public double getarea(){
				return with * height;
			}
		}
	
class triangle implements shape{
			private double base;
			private double height;
			
			triangle(double base , double height){
				this.base = base;
				this.height = height;
			}
			public double getarea(){
				return 0.5 * base * height;
			}
		}
class circle implements shape{
			private double radious;
			
			circle(double radious){
				this.radious = radious;
			}
			public double getarea(){
				return Math.PI * radious * radious;
			}
		}
public class shapetest{
			public static void main(String args[]){
				shape r = new rectangle(10,5);
					System.out.println(" ractangle " +r.getarea());
				
				shape t = new triangle(15,10);
					System.out.println(" triangle " +t.getarea());
					
				shape c = new circle(5);
					System.out.println(" circel " +c.getarea());
			}
		}