package sef.module9.sample;
// Needs to be completed
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListSample {
	public static void main(String[] args) {

		//Create an ArrayList
	    List list = new ArrayList();
	    List<String> list2 = new ArrayList();
	    // List implemented as growable array
	    list2.add("slhaslkdjaslds");
	    list2.add(123123);
	    // Add an element to the list
	    list.add("a");
	    list.add(123);
	    for(Object element : list) {
			if(element.equals(123))
	    		System.out.println(element);
			else
				System.out.println("Ele,ent not a 123");
		}

		// Insert an element at the head of the list
	    list.add(0, "b");
	    
	    // Get the number of elements in the list
	    int size = list.size();          // 2
	    
	    // Retrieving the element at the end of the list
	    Object element = list.get(list.size()-1);   // a
	    
	    // Retrieving the element at the head of the list
	    element = list.get(0);                      // b
	    
	    // Remove the first occurrence of an element
	    boolean b = list.remove("b");      // true
	    b = list.remove("b");              // false
	    
	    // Remove the element at a particular index
	    element = list.remove(0);          // a

	    
	    //1 - Add 3 more elements to the list - A, B and C
	    
	    
	    
		//call a method which prints this list
	    ListSample obj=new ListSample();
	    obj.print(list);
	}

	void print(List l)
	{
		//Iterator is an interface which provides a uniform way to access
		//individual elements of a Collection
		
		//2 - Use Iterator to iterate over this list.
			}
}
