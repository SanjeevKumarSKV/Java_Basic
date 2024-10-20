interface rock {
	void eat();
}
class sk implements rock {
	public void eat() {
		System.out.println(" anonymous ");
	}
}
public class AnonymousEx {
	public static void main(String args[]) {
		rock r = new sk();
		r.eat();
		
		rock s = new rock(){
			public void eat() {
				System.out.println(" no eat ");
			}
		};
		s.eat();
	}
}