
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// An Armstrong Number is a number in which the sum of the cubes of each 
		//digit is equal to the number itself
		
		// ex:- 371 = 3*3*3 + 7*7*7 + 1*1*1
		
		int num = 371;
		int actualnum = num;
		double result = 0;
		
		while(actualnum!=0) {
			int n = actualnum % 10;
			result = result + Math.pow(n,3);
			actualnum = actualnum / 10;
		
		}
		
		if(result == num) {
			System.out.println(num  +  "is an Armstrong no:-");
		}else {
			System.out.println(num + "is not an Armstrong number:-");
		}
	}

}
