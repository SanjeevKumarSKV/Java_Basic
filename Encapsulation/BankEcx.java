class banks{
				private double accno;
				private double accbal;
				
				banks(double accno,double accbal){
					this.accno = accno;
					this.accbal = accbal;
				}
				public double getaccno(){return accno;}
				public void setaccno(double accno){this.accno = accno;}
				public double getaccbal(){return accbal;}
				public void setaccbal(double accbal){this.accbal = accbal;}
				public void check(){

					System.out.println("acc no " +this.accno+ " acc balance " +this.accbal);
				}
				
			}
public class BankEcx{
					public static void main(String args[]){
						banks b = new banks(100002,9999999.888);
						b.check();
						
						banks b1 = new banks(100003,9999998.777);
						b1.check();
					}
				}