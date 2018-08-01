package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.ListSample;

import java.util.List;

public class ListActivity {

		public static void main(String[] args) {
			//1 - Type code to create a list of names. Use ArrayList.
			List<String> names = new ArrayList<>();
			names.add("Ron");
			names.add("Sam");
			names.add("Eli");

			//2 - Call print method to print the list passed as its parameter.

			print(names);
		}

		static void print(List<String> list) {
			//3 - Type code to print this list
			//Notice the order in which elements get printed.

			for (Object s : List) {
				System.out.println(list);
			}
		}
	}
