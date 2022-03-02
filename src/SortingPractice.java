import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 > len2) {
			return 1;
		} else if ( len1 < len2) {
			return -1;
		}
		
		return 0;
	}
	
}

class AlphaComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}
	
}


class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return  id + ":" + name ;
	}

	public int compareTo(Person s2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class SortingPractice {
	
	public static void main (String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1,"cat"));
		people.add(new Person(6,"bob"));
		people.add(new Person(8,"lion"));
		people.add(new Person(2,"zebra"));
		people.add(new Person(5,"elephant"));
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()) {
					return 1;
				} else if(p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}

//			@Override
//			public int compare(Person s1, Person s2) {
//				// TODO Auto-generated method stub
//				return s1.getName().compareTo(s2.getName());
//			}
			
			
			
		});
		System.out.println(people);
		
		
//		List<String> myList = new ArrayList<String>();
//		
//		myList.add("cat");
//		myList.add("snake");
//		myList.add("dog");
//		myList.add("elephant");
//		myList.add("lion");
//		
//		Collections.sort(myList, new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				return -s1.compareTo(s2);
//			}
//			
//		});
//		System.out.println(myList);
	}
	
	

}
