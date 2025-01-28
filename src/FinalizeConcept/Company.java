package FinalizeConcept;

public class Company {
	int i = 0  ; 
	String name;

	public static void main(String[] args) {
		Company c1= new Company();
		c1.name = "Anu" ; 
		c1 = null ; 
		System.gc();
	
		
//		Company c = new Company();
//		c = null;
//		//c.name = "IBM";
//		Employee e = new Employee();
//		e = null;
//		System.gc();
	}
	
		public void finalize() {
			System.out.println(" company finalise ....");
		}
	
//	@Override
//	public void finalize() {
//		System.out.println("comp -- finalize method....");
//	}
}
