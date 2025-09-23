package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWordas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a a this test" ; 
		StringBuilder Strrev ; 
        String[] words = str.split(" ");
        Map<String,Integer> mapWord= new HashMap() ; 
        for(String word: words) {
        	mapWord.put(word, mapWord.getOrDefault(word, 0)+1);
        }
        for (Entry<String, Integer> entry: mapWord.entrySet()){
        	if(entry.getValue()>1) {System.out.println(entry.getKey() + " duplicate " + entry.getKey() + " " + entry.getValue());
        			} 
        }
         
        System.out.println("no of words in string "+ CountWords(str));
        
        System.out.println("character a occurs " + countCharOccurrences(str,'t'));
        System.out.println("Reversed string: " + new StringBuilder(str).reverse().toString());
        // string char repeat
        Map <Character,Integer> lettercnt = characterRepeat(str) ; 
        for(Entry<Character,Integer> entry : lettercnt.entrySet()) {
        
        		System.out.println(entry.getKey() + " repeats " +entry.getValue());
        		}
        
        /** remove spaces **/
        System.out.println(str.replaceAll(" ", ""))	;
        

        	
}
      
	
	public static Integer CountWords(String Str1) {
	  String[] wordscnt = Str1.split(" ");
	  return wordscnt.length;
	}

	 public static int countCharOccurrences(String str, char ch) {
	        // Remove all instances of the character and compare lengths
	        int originalLength = str.length();
	        int newLength = str.replace(String.valueOf(ch), "").length();
	        return originalLength - newLength;
	    }
	 
	 public static Map<Character,Integer> characterRepeat(String str1) {
		 Map < Character, Integer> mapCharCnt = new HashMap() ; 
		 
		 for(int i=0;i<str1.length();i++) {
			 if(str1.charAt(0) != ' ') {
				 mapCharCnt.put(str1.charAt(i),mapCharCnt.getOrDefault(str1.charAt(i),0)+1 )	;	
			 }
		 }
		 return mapCharCnt ; 
	 }
}




//
//public class DuplicateWords {
//    public static void main(String[] args) {
//        String input = "This is a test. This test is only a test.";
//
//        // Remove punctuation and convert to lowercase
//        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
//
//        String[] words = input.split("\\s+");
//
//        Map<String, Integer> wordCount = new HashMap<>();
//
//        // Count frequency of each word
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        System.out.println("Duplicate words:");
//
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + " (count: " + entry.getValue() + ")");
//            }
//        }
//    }
//}
//
//🧾 Sample Output:
//
//Duplicate words:
//this (count: 2)
//is (count: 2)
//a (count: 2)
//test (count: 3)
//
//🔍 What This Program Does:
//
//    Cleans punctuation using replaceAll
//
//    Converts the input to lowercase to treat words like Test and test as the same
//
//    Splits words based on whitespace
//
//    Uses a HashMap to count word frequency
//
//    Prints words that occur more than once
//
//Let me know if you want to modify this for case-sensitive or exact word matching!
//
//
