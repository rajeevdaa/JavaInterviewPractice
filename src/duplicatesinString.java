
//Write a Java Program to find the duplicates of a given String.

public class duplicatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "beautiful sea";
		
		char[] carray = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(carray[i] == carray[j]) {
					System.out.println(carray[j] + " ");
					break;
				}
				
			}
		}

	}

}
