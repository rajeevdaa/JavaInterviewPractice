import java.util.ArrayList;

public class RemoveDuplicateStringWithoutHashSet {

	public static void main(String[] args) {
		String [] input = {"apple", "banana", "apple", "orange", "banana"};
		ArrayList<String> result = new ArrayList<>();
		
		for(String str : input) {
			if (!result.contains(str)) {
				result.add(str);
			}
		}
		
		System.out.println(result);

	}

}
