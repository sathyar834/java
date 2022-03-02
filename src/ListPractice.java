import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> animals = new ArrayList<String>();
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		myNumList(numbers);
		myList1(animals);
	}
	
	public static void myList(List<String> listofanimals) {
		listofanimals.add("fox");
		listofanimals.add("cat");
		listofanimals.add("dog");
		listofanimals.add("horse");
		
		for(String animals : listofanimals) {
			System.out.println(animals);
		}
	}
	
	public static void myList1(List<String> listofanimals1) {
		listofanimals1.add("fox");
		listofanimals1.add("cat");
		listofanimals1.add("dog");
		listofanimals1.add("horse");
		
		Iterator<String> myList1 = listofanimals1.iterator();
		while (myList1.hasNext()) {
			System.out.println(myList1.next());
		}
	}	
	
//	public static void myNumList(ArrayList<Integer> listofnumbers) {
//		listofnumbers.add(5);
//		listofnumbers.add(8);
//		listofnumbers.add(3);
//		listofnumbers.add(9);
//		
//		for(int i=0 ; i<listofnumbers.size(); i++) {
//			System.out.println(listofnumbers.get(i));
//		}
//	}
}
