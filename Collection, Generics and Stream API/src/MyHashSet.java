import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("Zeroth");

		set.add("First");

		set.add("Second");

		set.add(3);

		set.add(4);

		set.add(4);

//		System.out.println(set); instead use iterator

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
