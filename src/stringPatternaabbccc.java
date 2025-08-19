
public class stringPatternaabbccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbcccdddd";
		int [] counts = new int[(int) Character.MAX_VALUE];
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			counts[(int) ch]++;
		}
		
		for(int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
	            
	            System.out.print(""+ counts[i] + (char) i + "");
		}
		
	}

}
