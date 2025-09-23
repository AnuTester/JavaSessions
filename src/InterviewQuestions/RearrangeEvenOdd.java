package InterviewQuestions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RearrangeEvenOdd {
    public static void main(String[] args) {
    	   RearrangeEvenOdd res = new RearrangeEvenOdd();
//        int arr[] = {2, 5, 8, 7, 1, 3, 6, 4, 5, 9};
    	int arr[] = {2, 5, 3, 8, 1, 3, 6, 4, 10, 8,5 };
        
        // Call the function to rearrange even and odd numbers
        res.rearrangeEvenOdd(arr);
        
        // Print the rearranged array
        System.out.println(Arrays.toString(arr));
        
        
        String input = "abcd";
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            output.append(c).append(c);  // Append each character twice
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());
    
        
        // CharacterOccurence 
        Map <Character,Integer> mapCharCount= res.characterCount() ; 
        		// Print the result
        	    System.out.println("Character occurrences in automation");
        for (Map.Entry<Character, Integer> entry : mapCharCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }

    public void rearrangeEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
//        	System.out.println("left " + left + " right " + right);
            // Move left pointer to the right until it finds an odd number
            while (arr[left] % 2 == 0 && left < right) {
//            	System.out.println("in while left even " + left + " array  "+ arr[left]+ " right " + right +" array  "+ arr[right]);
                left++;
            }

            // Move right pointer to the left until it finds an even number
            while (arr[right] % 2 != 0 && left < right) {
//            	System.out.println("left " + left +" array "+ arr[left]+ " right find even " + right+" array "+ arr[right]);
                right--;
            }

            // Swap the even number at left with the odd number at right
            if (left < right) {
            	System.out.println("swap left " + left +" array "+ arr[left]+ " right find even " + right+" array "+ arr[right]);
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
    
    public  Map<Character,Integer> characterCount(){
    	String input = "Automation";
    Map<Character, Integer> charCountMap = new HashMap<>();

    // Convert string to lowercase to treat uppercase/lowercase as same
    input = input.toLowerCase();

    for (char c : input.toCharArray()) {
        if (Character.isLetter(c)) { // Optional: count only letters
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
    }

    return charCountMap ; 
   
    }
}

