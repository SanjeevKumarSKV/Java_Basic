import java.util.ArrayList;
class Vehicals {
							String name ;
							String color ;
							int wheel ;
							
							public Vehicals(String name , String color , int wheel){
								this.name = name;
								this.color = color;
								this.wheel =  wheel;
							}
							public void run(){
								System.out.println(" name " +this.name+ " color " +this.color+ " wheel " +this.wheel);
							}
							public String toString() {
					return "Car{" +"name='" + name + '\'' +
									", color=" + color +
									", wheel='" + wheel + '\'' +
									'}';
				}
			}
public class Cars{
						public static void main(String args[]){
							
							ArrayList<Vehicals> car = new ArrayList<> ();
								
								Vehicals bmw = new Vehicals("bmw","blue",4);
								bmw.run();
								
								Vehicals ferrari = new Vehicals("ferrari","red",4);
								ferrari.run();
								
								Vehicals bucati = new Vehicals("bucati","fiber",4);
								bucati.run();
								
								Vehicals audi = new Vehicals("audi","white",4);
								audi.run();
								
								Vehicals bence = new Vehicals("bence","black",4);
								bence.run();
								
								car.add(bmw);
								car.add(ferrari);
								car.add(bucati);
								car.add(audi);
								car.add(bence);
							
								System.out.println(car);
								
						}
					}