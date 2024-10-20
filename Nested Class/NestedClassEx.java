class nested {
	public static int a = 10;
	
	public static class nested1 {
		public void print(){
			System.out.println(" nested class ");
		}
	}
	public class innerclass {
		public void inner () {
			System.out.println(" inner class ");
		}
	}
	public void test() {
		System.out.println(" public method ");
	}
}
public class NestedClassEx {
	static {
			System.out.println(" hiiiii ");
		}
		
	public static void main(String args[]) {
		
		nested.nested1 s = new nested.nested1();
		s.print();
		System.out.println(nested.a);
		
		nested.innerclass k = new nested().new innerclass();
		k.inner();
		
		nested v = new nested();
		v.test();
	}
}

	