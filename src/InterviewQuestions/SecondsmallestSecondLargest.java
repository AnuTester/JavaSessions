package InterviewQuestions;

import java.util.Arrays;

public class SecondsmallestSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 5, 8, 19, 33, 2, 33,6}; // Sample array

        if (arr.length < 2) {
            System.out.println("Array must contain at least two distinct elements.");
            return;
        }

        // Sort the array
        Arrays.sort(arr);
        System.out.println(arr);

        // Find second smallest
        int smallest = arr[0], secondSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        // Find second largest
        int largest = arr[arr.length - 1], secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondSmallest == -1 || secondLargest == -1) {
            System.out.println("No second smallest or second largest found (array has all identical elements).");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }
	

}
