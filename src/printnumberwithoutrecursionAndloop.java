import java.util.Arrays;

public class printnumberwithoutrecursionAndloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print number 1-100 without using look and recursion
		 * 
		 */
		
		Object num[] = new Object[100];
		Arrays.fill(null, new Object() {
			int count = 0;
			
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
	//	System.out.println(Arrays.toString(null));
	}

}
