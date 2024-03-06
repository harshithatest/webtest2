import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

		// Adding elements to the TreeSet
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");

		// Printing the TreeSet
		System.out.println(set);

		// Removing an element from the TreeSet
		set.remove("Banana");

		// Printing the TreeSet after removal
		System.out.println(set);

		// Checking if an element exists in the TreeSet
		boolean contains = set.contains("Orange");
		System.out.println("Contains Orange: " + contains);

		// Getting the size of the TreeSet
		int size = set.size();
		System.out.println("Size: " + size);

		// Clearing the TreeSet
		set.clear();

		// Printing the TreeSet after clearing
		System.out.println(set);
	}
}