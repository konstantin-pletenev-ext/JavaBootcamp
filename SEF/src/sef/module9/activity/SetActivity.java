"package sef.module9.activity;

//Needs to be completed
import java.util.Set;
import java.util.SortedSet;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.

		Set<String> names = new TreeSet<>();
		names.add("Zen");
		names.add("Jan");
		names.add("Ana");
		names.add("May");
		names.add("Ron");
		names.add("Don");
		names.add("Ana");


		//2 - Call print method to print the set passed as its parameter.
		print(names);
	}

	static void print(Set set) {
		for (Object o : set) {
			System.out.println(o);

			//3 - Type code to print this set
			//Notice the order in which elements get printed.
		}
	}
}
