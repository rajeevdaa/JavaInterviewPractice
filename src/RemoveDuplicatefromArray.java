import java.util.LinkedHashSet;

public class RemoveDuplicatefromArray {
	
	public static void remove (int[]a)
	{
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		// adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            s.add(a[i]);
        System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };
		
		remove(a);

	}

}
