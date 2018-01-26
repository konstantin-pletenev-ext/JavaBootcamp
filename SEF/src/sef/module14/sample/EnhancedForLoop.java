package sef.module14.sample;
//Complete Code
import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int[] sqr = { 0, 1, 4, 9, 16, 25 };
		for (int c : sqr) {
			System.out.println(c);
		}

		List<String> names = new ArrayList<String>();
		names.add("John Doe");
		names.add("Jane Doe");
		for (String i : names) {
			System.out.println(i);
		}

	}
}
