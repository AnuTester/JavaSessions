package InterviewQuestions;

public class ConvertIntegerToStringViceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String to integer
		String str = "1234";
        int number = Integer.parseInt(str);
        System.out.println("String to Integer: " + number);
        
        // Integer to string
        String Str = "" ; 
        Str = String.valueOf(number); 
        System.out.println("Integer to string : " + Str);

        
        // string to double
        Str = "22.22" ;
        Double dbl = Double.parseDouble(Str) ; 
        System.out.println(dbl) ; 
        
        //string to float 
        Float Flt = Float.parseFloat(Str);
        System.out.println(Flt) ; 

        //float to string
        Flt = 1.22f ;        Str = String.valueOf(Flt);
        
        System.out.println(Str) ; 

        
        // Strings Immutable
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("Original String: " + original);
        String originalid = original ; 
        System.out.println("Modified String: " + modified);
        original = original + " Test" ;
        System.out.println(" true false original added " + (originalid==original));
        
        

	}

}
