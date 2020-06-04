import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Zeroth");
		
		list.add("First");
		
		list.add("2nd");
		
		list.add("Third");
		
//		list.add(new Float(21.12f)); deprecated way
		list.add(21.12f);
		
//		System.out.println(list); instead use iterator
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
