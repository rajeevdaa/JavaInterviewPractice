import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fblength;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		fblength = sc.nextInt();
		
		int num[] = new int[fblength];
		num[0] = 0;
		num[1] = 1;
		
		for(int i = 2; i<fblength; i++) {
			num[i] = num[i-1] +num[i-2];
		}
		System.out.println("fabonic series");
		
		for (int i = 0; i < fblength; i++) {
			System.out.print(num[i] + " ");
			
		}
		
		
			
	}
	


}
