package sef.module9.activity;
//Needs to be completed

import java.util.Map;


public class MapActivity {

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		//where key is id of type String and value is a name

		Map names = new HashMap();
		names.put("name1", "Jen");
		names.put("name2", "Zen");
		names.put("name3", "Den");

		//2 - Call print method to print the map passed as its parameter.

		print(names);

		static void print(Map map);

		{
			//3 - Type code to print this map
			System.out.println(map.keySet());
			List keys = new ArrayList();
			keys = (List) map.keySet();

			for (Object o: map.keySet()) {
				System.out.println(map.get(o));
			}
		}
	}
}
