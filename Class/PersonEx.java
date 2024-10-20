class Person{
				String name = " sanjeev ";
				int age = 20;
			
				Person(){
					
					System.out.println( " constructor ");
				}
				public void walk(){
					System.out.println(" name " +this.name+ " age " +this.age);
				}
				public String toString() {
					return "Car{" +"name='" + name + '\'' +
									", age=" + age + '\'' +
									'}';
				}
			}
			
public class PersonEx{
						public static void main(String args[]){
							Person s = new Person();
							s.name = " nikesh ";
							s.age = 21;
							s.walk();
							System.out.println(s);
							
							Person s1 = new Person();
							s1.name = " nitish ";
							s1.age = 21;
							s1.walk();
							System.out.println(s1);
							
							Person s2 = new Person();
							s2.walk();
							System.out.println(s2);
						}
					}