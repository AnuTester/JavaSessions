package InterviewQuestions;

import java.util.Arrays;

public class AnagramCheck {
	 public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        boolean isAnagram = checkAnagram(str1, str2);
	        System.out.println(str1 + " and " + str2 + " are anagrams: " + isAnagram);
	        boolean isAnagram1 = anagramchk("damn","DAMN");
	        System.out.println( " are anagrams: " + isAnagram1);

	    }

	    public static boolean checkAnagram(String s1, String s2) {
	        // Remove spaces and convert to lowercas
	 	    s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        // Check lengths
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Convert to char array, sort, and compare
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        return Arrays.equals(arr1, arr2);
	    }
	    
	    
	    
	    
	    
	    public static boolean anagramchk(String str11, String str12) {
	    	boolean flg =false ; 
	    	str11 = str11.replaceAll("//s", "").toLowerCase();
	    	str12 = str12.replaceAll("//s", "").toLowerCase();
	    	if(str11.length()!=str12.length()) {flg = false ; }
	    	// convert to char array, sort and  compare
	    	char[] arrstr1 = str11.toCharArray();
	    	char[] arrstr2 = str12.toCharArray() ; 
	    	Arrays.sort(arrstr1) ; 
	    	Arrays.sort(arrstr2); 
	    	if (Arrays.equals(arrstr1, arrstr2)) { flg = true; }

	    	return flg ; 
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
	    
	    
	    
}
