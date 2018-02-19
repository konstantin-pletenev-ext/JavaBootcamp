package sef.module8.sample;
// Needs to be completed
public class ArrayExceptionSample {

	public static void main(String arg[]){
		
		//The valid indices for this array are from 0 to 4
		int scores[] = new int[5];
		scores = new int[]{0, 1, 2, 3, 4};
		
		//But the the loop below will run from 0 to 5.
		//Last index is 4 so accessing scores[5] will cause an exception
		//1 - Create a for loop that runs from 0-5. Print elements of this array inside the loop.
		for (int i = 0; i <=66; i++) {
			try {
				System.out.println(scores[i]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Your code failse with exception" +
						" " + ex.getMessage());
			}

		}
			
		// The above loop is a logical error in the program which results in
		// ArrayIndexOutOfBoundsException. This is an example of Unchecked Exception.
		
	}
}
