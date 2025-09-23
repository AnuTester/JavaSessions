package StringManipulations;

import java.util.LinkedHashMap;
import java.util.Map;

public class stringCompressor {
    public static String compress(String input) {
        // If input is null or empty, return it as is
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Iterate through the string
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; // Increase count for consecutive characters
            } else {
                compressed.append(count).append(input.charAt(i - 1)); // Append count and character
                count = 1; // Reset count for next character
            }
        }
        
        // Append the last character group
        compressed.append(count).append(input.charAt(input.length() - 1));

        // Return the compressed string
        return compressed.toString();
        
    }
    
    public static String compressString(String input) {
        // Check for an empty string
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        // Loop through the string starting from the second character
        for (int i = 1; i < input.length(); i++) {
            // If the current character is the same as the previous one, increase the count
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // If it's different, append the previous character and its count
                compressedString.append(count).append(input.charAt(i - 1));
                count = 1; // Reset count for the new character
            }
        }
        // Append the last character and its count
        compressedString.append(count).append(input.charAt(input.length() - 1));

        // Return the compressed string
        return compressedString.toString();
    }
    
    
    public static String processString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
//        int k =1 ; 
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
//        	 k++;
//        	 System.out.println("Characeter is " + c + " count " + k);
//        	 charCounts.put(c, charCounts.getvalue(c) + 1);
        	charCounts.put(c, charCounts.getOrDefault(c, 0) + 1) ;
        }
        
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
       	 System.out.println("Characeter is " + entry.getKey() + " count " + entry.getValue());

            result.append(entry.getValue()).append(entry.getKey()).append(" ");
        }

        // Remove trailing space
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
    
       

    public static void main(String[] args) {
        String input = "aaabbaccc";
        String compressedString = compress(input);
        System.out.println("Compressed String: " + compressedString);
        
        String inputa = "aaabcbacc";
        String result = compressString(inputa);
        System.out.println("compress string a" + result);  // Output: 4a2b3c
        
        result = processString(inputa);
        System.out.println("compress string b" + result);  // Output: 4a2b3c
        
    }
}
