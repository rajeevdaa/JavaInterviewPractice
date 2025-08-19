
public class TESTING1 {

	public static void main(String[] args) {
		
		String str = "Rajeev Ranjan";
        String reversestr = "";
        
        for(int i = str.length()-1; i>=0; i--){
            
            reversestr = reversestr + str.charAt(i);
            
        }
        System.out.println(reversestr);

	}

}
