package InterviewQuestions;


public class MaxCharRepeat {
    public static void main(String[] args) {
        String input = "Banana";
        input = input.toLowerCase(); // Case insensitive counting

        int[] frequency = new int[256]; // For ASCII characters

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
        }
 System.out.println(frequency);
        // Find character with maximum frequency
        int max = 0;
        char maxChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > max) {
            	 System.out.println(frequency[i]);

                max = frequency[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Character with maximum repetitions: '" + maxChar + "' repeated " + max + " times.");
    }
}

