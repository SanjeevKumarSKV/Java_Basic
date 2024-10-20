class pair<s , k , p> {
	s first;
	k second;
	p third;
	
	public pair(s first , k second , p third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public void run(){
		System.out.println(" first " +this.first+ " second " +this.second+ " third " +this.third);
	}
	
	public String toString() {
					return "sk{" +"first='" + first + '\'' +
									", second=" + second +
									", third='" + third + '\'' +
									'}';
	}
	
}				
public class Generics {
	public static void main(String args[]) {
		pair<Integer , String , String>  n = new pair<>(10,"sanjeev","priya");
		n.run();
		System.out.println(n);
		
		pair<String , String , Integer> n1 = new pair<>("sanjeev" , "priya" , 10);
		System.out.println(n1);
		n1.run();
	}
}
	

	
		
