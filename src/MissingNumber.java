
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 4, 5, 6}; // Missing number: 3
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number: " + missingNumber);
	}
	
	public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2; // Sum of first n numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum; // Missing number
    }

}
