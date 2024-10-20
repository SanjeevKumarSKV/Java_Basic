class employees{
					private String name;
					private String jobtitle;
					private double salary;
					private double annualsalary;
				
					
					employees(String name, String jobtitle,double salary){
						this.name = name;
						this.jobtitle = jobtitle;
						this.salary = salary;
						
					}
					public  String getname(){
						return name;
					}
				
					public void setname(String name){
						this.name = name;
					}
					
					public String getjobtitle(){
						return jobtitle;
					}
					
					public void setjobtitle(String jobtitle){
						this.jobtitle = jobtitle;
					}
					
					public double getsalary(){
						return salary;
					}
					
					public void setsalary(double salary){
						this.salary = salary;
					}
					
					public double getannualsalary(){
						return 12 * salary;
					}
					public void setannualsalary(double annualsalary){
						this.annualsalary = annualsalary;
					}	
					
					
					public void check(){
						System.out.println("name " +this.name+ " jobtitle " +this.jobtitle+ " salary " +this.salary+ " annual salary " +getannualsalary());
					}

    public void setemp_id(int i) {
    }

	public void setemp_name(String nikesh) {

	}
}
				
				
public class EmployeeEx{
						public static void main(String args[]){
							employees e = new employees(" sanjeev ", " IT ",40000);
							e.check();
						}
}