package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReverseStringPreserveSpaces {

    public static void main(String[] args) {
        String input = "t h i s   i s   a   t e s t";
        input = "Java Concept Of Day isssssssssss..." ;
//        System.out.println("Original: " + input);
//        
//        /** reverse with space maintained and place maintained  **/
//        System.out.println("Reversed: " + reversePreservingSpaces(input));
//      
//        input = "javaisadelight";
//        / **longest unique substring no repeats in  string - tracks end,  **/
       /** start, maxlength, store in hashmap and drops the letters till unique  **/
//        System.out.println(longestUniqueSubstring(input));
//        
//        /** swap without temp variables  **/
//        SwapStringwithouttemp() ; 
//        
//        /**first repeated and non repeated character **/
//        System.out.println((findFirstRepeatedChar(input)));
//        System.out.println(findFirstNonRepeatedChar(input));
//       
//        /** Palindrome */
//        palindrome("hereh") ; 
        
        /**remove all vowels **/
//        System.out.println(removeVowels(input)) ;
        
        /** 8Print all substrings = moves one char at a time and makes substring with all the remaining char */
//        printAllSubstrings(input) ;    
        
        /** common char  , tree set is used to sort**/
//        String str1 = "this is" ; 
//        String str2 = " this is fun exercise" ; 
//        System.out.println(getCommonCharactersSorted(str1,str2)); 
//        
        
        /** most freq char*/
        findMostFrequentChar(input) ; 

        
    }
    
    
    /** most frequent char */
    public static void findMostFrequentChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isWhitespace(c)) continue; // Skip spaces
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (mostFrequentChar != '\0') {
            System.out.println("'" + mostFrequentChar + "' occurs " + maxCount + " times");
        } else {
            System.out.println("No characters found.");
        }
    }
    
    
    /** common char max repition in order , tree set is used to sort */
    public static String getCommonCharactersSorted(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> common = new TreeSet<>(); // TreeSet keeps elements sorted

        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) {
                common.add(c);
            }
        }

        // Convert the sorted set to a string
        StringBuilder result = new StringBuilder();
        for (char c : common) {
            result.append(c);
        }
        return result.toString();
    }
    
    
    /** all substrings  ex abc - a, abc, ab, bc,b, c */
    public static void printAllSubstrings(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    
    public static String removeVowels(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static String reversePreservingSpaces(String str) {
        char[] inputArr = str.toCharArray();
        char[] result = new char[inputArr.length];

        // Mark the positions of spaces
        for (int i = 0; i < inputArr.length; i++) {
//        	System.out.println(i+ " i "+ inputArr[i]) ; 

            if (inputArr[i] == ' ') {
//            	System.out.println(i) ; 
                result[i] = ' ';
            }
        }

        // Traverse input from end to start and fill in non-space characters
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != ' ') {
                while (result[j] == ' ') {
//                	System.out.println(j +" j" );
                    j--;
                }
                result[j] = inputArr[i];
                j--;
            }
        }

        return new String(result);
    }
    
    //Javaisadelight
    
    public static String longestUniqueSubstring(String str) {
        int start = 0, maxLength = 0, maxStart = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char current = str.charAt(end);
//            System.out.println(end + " end " + "start " + start);
            while (seen.contains(current)) {
//                System.out.println(end + " end in while  " + "start " + start);

                seen.remove(str.charAt(start));
                start++;
            }
            seen.add(current);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return str.substring(maxStart, maxStart + maxLength);
    }
    
    public static void SwapStringwithouttemp() {
    	String str1 = "Hello";
        String str2 = "World";

        str1 = str1 + str2 ; 
        str2 = str1.substring(0,str1.length()-str2.length()) ; 
        str1 = str1.substring(str2.length()) ; 
        
        
        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
//
//        // Swapping logic
//        str1 = str1 + str2;                     // str1 = "HelloWorld"
//        str2 = str1.substring(0, str1.length() - str2.length()); // str2 = "Hello"
//        str1 = str1.substring(str2.length());   // str1 = "World"
//
        System.out.println("\nAfter Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
    
    public static Character findFirstRepeatedChar(String str) {
        Set<Character> seen = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return c;
            } else {
                seen.add(c);
            }
        }
        return null;
    }

    // 🔍 First Non-Repeated Character
    public static Character findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public static void palindrome(String str) {
    	for(int i=0;i<str.length()/2;i++) {
    		System.out.println("i " + i + " end position " + (str.length()-(i+1)) );
    		if(str.charAt(i)!= str.charAt(str.length()-(i+1))) {
    			System.out.println("not palindrome");
    			break;
    			
    		}
//			System.out.println(" palindrome");

    	}
		System.out.println(" palindrome");

    }
}

