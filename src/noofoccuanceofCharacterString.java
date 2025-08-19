
public class noofoccuanceofCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Rajeeevj jchfdyefwedvh cbhgfyfdtye";
		char[] ch = s.toCharArray();
		boolean[]b = new boolean[s.length()];
		System.out.println("character occurance");
		
		for(int i=0; i<ch.length; i++) {
			if(b[i])continue;
			int c= 1;
			
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					c++;
					b[j] = true;
				}
			}
			
			System.out.println(ch[i] + "-->" + c);
		}

	}
	
	

}
