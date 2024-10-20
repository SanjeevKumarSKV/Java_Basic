import java.util.HashMap;
import java.util.Map;
 import java.util.Objects;
 
 public  class HashMaps {
	public static void main(String args[]){
		Map<Integer , String> s = new HashMap<>();
		
		s.put(151,"nikesh");
		s.put(152,"nithish");
		s.put(154,"sanjeev");
		
		String name = s.get(151);
		System.out.println(s);
		
		System.out.println(name);
		
		for(Map.Entry <Integer , String> entry : s.entrySet()){
		
			String name1 = entry.getValue();
			System.out.println(" the key is " +entry.getKey()+ " the value is " +entry.getValue());
		}
		for(Integer z : s.keySet()){
			System.out.println(" key is " +z);
		}
		for (String p : s.values()){
			System.out.println(" value is " +p);
		}
		
		Student s1 = new Student(1,"sanjeev");
		Student s2 = new Student(1,"nithish");
		Student s3 = new Student(1,"nithish");
		
		Map<Student , String> sk = new java.util.HashMap<>();
		
		sk.put(s1,"s1");
		sk.put(s2,"s2");
		sk.put(s3,"s3");
		
		for(Map.Entry<Student , String> entry : sk.entrySet()){
			System.out.println(" KEY IS " +entry.getKey()+ " VALUES IS " +entry.getValue());
		}
	}
		static class Student {		
			int rollno ;
			String name ;
			
			public Student (int rollno , String name){
				this.rollno = rollno ;
				this.name = name ;
			}
			@Override
			public boolean equals(Object o) {
				if (this == o) return true;
				if (!(o instanceof Student)) return false;
				Student student = (Student) o;
				return rollno == student.rollno && Objects.equals(name, student.name);
			}
			
			@Override
			public int hashCode() {
				return Objects.hash(rollno, name);
			}

			@Override
			public String toString() {
				return "student{" +
						"rollno=" + rollno +
						", name='" + name + '\'' +
						'}';
			}
		}
	
}
 
 


