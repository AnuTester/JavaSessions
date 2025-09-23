package InterviewQuestions;

public class ReverseWithSpace {
	    public static void main(String[] args) {
	        String input = "are b c delight";
	        String result = reversePreserveSpace(input);
	        System.out.println("Original : \"" + input + "\"");
	        System.out.println("Reversed : \"" + result + "\"");
	        result = reverseWords(input) ; 
	        System.out.println(result);
	        
	    }
	    
	    
	    public static String reversePreserveSpace(String str){
	    	char[] inputarr = str.toCharArray();
	    	char[] result = new char[inputarr.length];
	    	
	    	for( int i=0;i<inputarr.length;i++) {

	    		if(inputarr[i] == ' ') {
	    			result [i]= ' ' ;
	    		}
	    	}
	    	
	    	int j = inputarr.length-1 ;
	    	for (int i=0;i<str.length();i++) {
	    		if(inputarr[i] != ' ') {
	    			while (result[j] == ' ') {
	    				j-- ; 
	    			}
	    			result[j] = inputarr[i] ; 
	    			j-- ; 
	    		}
	    	}
	    	return new String(result) ; 
	    	
	    }
	    
	    public static String reverseWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            result.append(reversedWord.reverse()).append(" ");
	        }

	        return result.toString().trim(); // Remove trailing space
	    }
	    

	    public static String reversePreserveSpacesnotak(String str) {
	        char[] inputArr = str.toCharArray();
	        char[] result = new char[inputArr.length];

	        // First, mark spaces in result
	        for (int i = 0; i < inputArr.length; i++) {
	            if (inputArr[i] == ' ') {
	                result[i] = ' ';
	            }
	        }

	        // Now, fill in characters in reverse (skipping spaces)
	        int j = inputArr.length - 1;
	        for (int i = 0; i < inputArr.length; i++) {
	            if (inputArr[i] != ' ') {
	                while (result[j] == ' ') {
	                    j--;
	                }
	                result[j] = inputArr[i];
	                j--;
	            }
	        }

	        return new String(result);
	    }
	}

