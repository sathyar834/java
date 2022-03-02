import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class People {
	private int id;
	private String name;
	
	public People (int id , String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	public String toString() {
		return id +":"+ name;
	}
	
}

public class SetPractice {

	public static void main(String[] args) {
		
		People p1 = new People(1,"bob");
		People p2 = new People(5,"kite");
		People p3 = new People(3,"sue");
		People p4 = new People(1,"bob");
		
//		Map<People, Integer> people = new HashMap<People, Integer>();	
//		
//		people.put(p1, 1);
//		people.put(p2, 2);
//		people.put(p3, 3);
//		people.put(p4, 4);
//		
//		System.out.println(people);
		
		Set<People> peopleSet = new HashSet<People>();	
		
		peopleSet.add(p1);
		peopleSet.add(p2);
		peopleSet.add(p3);
		peopleSet.add(p4);
		
		System.out.println(peopleSet);
		
//		Set<String> mySet1 = new TreeSet<String>();
//		
//		if(mySet1.isEmpty()) {
//			System.out.println("set is empty before");
//		}		
//		
//		mySet1.add("cat");
//		mySet1.add("snake");
//		mySet1.add("dog");
//		mySet1.add("mouse");
//		mySet1.add("lion");
//		
//		if(mySet1.contains("snake")) {
//			System.out.println("snake is present");
//		}		
//		
//		Set<String> mySet2 = new TreeSet<String>();
//		
//		mySet2.add("cat");
//		mySet2.add("snake");
//		mySet2.add("dog");
//		mySet2.add("tiger");
//		mySet2.add("elephant");	
//		
//		Set<String> intersection = new TreeSet<String>(mySet2);
//		System.out.println(intersection);
//		
//		intersection.removeAll(mySet1);
//		System.out.println(intersection);
		
	}

}
