package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("in main");
		try {
		int i=9/0 ;}
		catch (ArithmeticException e) {
			System.out.println("in main catch"  );
			e.printStackTrace();
			}
		catch(Error e1) {
			e1.printStackTrace();
		}
		finally {
			System.out.println("inside finally block...");
		}
		
		
	}

}
