package InterviewQuestions;

public class StaticDummy {
	static {
		System.out.println("Static block"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java" ; 
		str.concat("great " ) ; 
		System.out.println("main method block"); 

		final int i = 1 ; 
		System.out.println("increment block " + (i+1)); 
		System.out.println("main block str "+str); 


	}

}
