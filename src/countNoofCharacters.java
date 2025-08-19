
//Write a Java Program to count the number of characters in a given String.


public class countNoofCharacters {
	
	public static void main(String[] args) {
		
		String str = " Rajeev is in Testing";
		int count = 0;
		
		for(int i =0; i<str.length(); i++) {
			  if(str.charAt(i) != ' ') 
				count++;
		}
		
		System.out.println("Total no of charaters in String:" + count);
	}

}
