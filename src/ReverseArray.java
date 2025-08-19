import java.util.Arrays;


// Write a Java Program to reverse an array?
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = new int[] {1, 2, 3, 4, 5};
	//	 for (int i = 0; i < arr.length; i++) {
	//		 System.out.println(arr[i] + " ");
	//	 }
		 
		 for(int i = arr.length-1; i>=0; i--) {
			 System.out.println(arr[i] + " ");
		 }

	}

}
