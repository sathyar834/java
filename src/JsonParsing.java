import java.util.HashMap;
import java.util.Map;


public class JsonParsing {
	public static void main(String[] args) {
		Map<Integer,String> myData = new HashMap<Integer,String>();
		myData.put(1, "Sathya");
		myData.put(1, "Hari");
		myData.put(1, "Nanda");
		
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode jsonNode = mapper.valueToTree(map);
		System.out.println(myData);
	}
}
