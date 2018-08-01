package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		
		// Subtract numbers
		int result = i-j;
		
		// Print result
		System.out.println("Diff is: " + result);
		
		// Add numbers
		result = i+j;
		
		// Print result
		System.out.println("Add is: " + result);

		// Divide numbers
		result = i/j;

		//Print reult
		System.out.println("Div is: " + result);

		// Multiply numbers
		result = i*j;

		//Print reult
		System.out.println("Mult is: " + result);

		// Module numbers
		result = i%j;

		//Print reult
		System.out.println("Mod is: " + result);

		//Correct division
		float result_float = (float) i / (float) j;

		//Print reult
		System.out.println("Correct division is: " + result_float);



	}

}
