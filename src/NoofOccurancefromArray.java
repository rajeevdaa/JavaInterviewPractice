import java.util.Arrays;

public class NoofOccurancefromArray {

	public static void main(String[] args) {
		int arr[] = {1,1,2,9,9,3,5,2,2};
		countoccurance(arr);

	}
	
	static void countoccurance(int arr[]) {
		Arrays.sort(arr);
		for(int i =0; i<arr.length-1; i++) {
			int count =1;
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
				else
					break;
			}
			System.out.println(arr[i]+" -> "+ count);
			i+=(count-1);
		}
	}

}
