import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class RemoveallDuplicateString {

	public static void main(String[] args) {
		
		String str = "Rajeev";
		char[] chars = str.toCharArray();
		
		Set<Character> charset = new LinkedHashSet<Character>();
		
		for (char c: chars) {
			charset.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character character : charset) {
			sb.append(character);
		}
		System.out.println(sb.toString());
	}

}
