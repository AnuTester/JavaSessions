package ExceptionHandling;

public class Student {
	public static int getMarks(String name) {

		System.out.println("student name : " + name);

		if (name.equals("Sandeep")) {
			try {
				int marks = 10 / 0;
				//System.exit(1);//jvm down
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("some ex is coming....");
				return 70;
			}
			finally {
				System.out.println("Bye");
				return 90;
			}
		} 
		else if (name.equals("Roopali")) {
			return 100;
		} else if (name.equals("Naveen")) {
			return 10;
		} else {
			System.out.println("student is not present");
			return -1;
		}

	}

	public static void main(String[] args) {
		int m1 = getMarks("Sandeep");
		System.out.println(m1);
		
		//db connection -- pass 
		//pass sql string -- pass
		//try{
		//results from db -- exceptions // no exception
		//}
//		catch() {
//			some sql exception is coming
//		}
//		finally {
//			//close db connection
			//close excel / file / prop file / xml /json/ 
			//driver.quit
//		}
		//print the result from db
}
}