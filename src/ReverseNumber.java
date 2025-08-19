
public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123456;
		 int reverse = 0;
		 
		 for(; number != 0; number /= 10) {
			 int remainder = number % 10;
			 reverse = reverse * 10 + remainder;
		 }
		 System.out.println("reverse number is " + reverse);
	}

}
