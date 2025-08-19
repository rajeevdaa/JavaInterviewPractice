
public class ConvertnumbertoString {
	
	static void covertNumbertoChar(String s) {
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			
			else {
				int a= Character.getNumericValue(s.charAt(i));
				for(int j=1; j<a; j++) {
					System.out.println(s.charAt(i-1));
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "a2b4c3";
		covertNumbertoChar(str);

	}

}
