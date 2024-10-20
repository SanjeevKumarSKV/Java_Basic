class dogs{
			String name = " lab ";
			String breed = " meet ";
			
			dogs(String name,String breed){
				this.name = name;
				this.breed = breed;
				
				System.out.println( " constructor ");
			}
			dogs(){
				System.out.println(" no-args ");
			}
			
			public void walk(){
				System.out.println(" name " +this.name+ " breed " +this.breed);
			}
			
			public String toString() {
					return "Car{" +" name = '" + name + '\'' +
									", breed =" + breed + '\'' +
									'}';
			}
		}
public class DogEx{
					public static void main(String args[]){
						dogs d = new dogs(" jimmy "," bediciries ");
						d.walk();
						System.out.println(d);
						
						dogs d1 = new dogs(" scooby "," bediciries ");
						d1.walk();
						System.out.println(d1);
						
						dogs d2 = new dogs();
						d2.walk();
						System.out.println(d2);
					}
				}
						