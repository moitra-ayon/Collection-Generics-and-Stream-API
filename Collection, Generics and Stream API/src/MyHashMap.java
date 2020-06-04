
//Non-generic 
import java.util.*;

public class MyHashMap {

	public static void main(String[] args) {

		Map map = new HashMap();

		// Adding elements to map

		map.put(1, "Sachin");

		map.put(5, "Suresh");

		map.put(2, "Gautam");

		map.put(6, "Rohit");

		// Traversing Map

		// Converting to Set so that we can traverse
		Set set = map.entrySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
