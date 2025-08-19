import java.util.Arrays;
import java.util.Collections;

public class SecondLargestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        int secondLargest = arr[1]; // Second largest after sorting
        System.out.println("Second Largest Number: " + secondLargest);
	
		
	} 

	

}
