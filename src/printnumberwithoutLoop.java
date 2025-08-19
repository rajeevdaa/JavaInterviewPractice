
public class printnumberwithoutLoop {

	public static void main(String[] args) {
		
		printNumber(1);
		// TODO Auto-generated method stub
		
		/*
		 * print number 1 to 100 without loop
		 * 
		 * 1 recursive function
		 * 2 java streams
		 */

	}
	
	public static void printNumber(int num) {
		if(num<=100) {
		
		System.out.println(num);
		num++;
		printNumber(num);
	}
		
	}
}
