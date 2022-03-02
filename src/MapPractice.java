import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer,String> myMap = new LinkedHashMap<Integer,String>();
		myMap.put(1,"one");
		myMap.put(5,"five");
		myMap.put(3,"three");
		myMap.put(8,"eight");
		myMap.put(10,"ten");
		
//		for(Entry<Integer, String> entry : myMap.entrySet()) {
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key +":" + value);
//		}
		
		for( Integer keys : myMap.keySet()) {
			String values = myMap.get(keys);
			System.out.println( keys + ":" + values);
		}

	}

}
