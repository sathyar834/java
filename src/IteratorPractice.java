import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorPractice {
	public static void main (String[] args) {
		List<Integer> keyName = new ArrayList<Integer>();
		List<String> valueName = new ArrayList<String>();
		keyName.add(1);
		keyName.add(2);
		keyName.add(3);
		keyName.add(4);
		valueName.add("Sathya");
		valueName.add("Arun");
		valueName.add("Nanda");
		valueName.add("Sowmya");
//		valueName.add("laav");
		System.out.println("keys" + keyName);
		System.out.println("values" + valueName);
		Map<Integer, String> myDict = new HashMap<Integer, String>();
		
		Iterator<Integer> key = keyName.iterator();
		Iterator<String> value = valueName.iterator();
		
		// This will directly exit if the size doesn't match
		if (keyName.size() == valueName.size()) {
			//This alone will put only 1st 4 elements and loop breaks on 5th element
			while (key.hasNext() && value.hasNext()) {
				myDict.put(key.next(), value.next());
			}
			System.out.println(myDict);
		}else {
			System.out.println("length not matching");
		}

		
		
	}
}