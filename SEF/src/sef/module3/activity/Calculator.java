/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) {
		
	int x = 5;
	int y = 10;
	
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = --(x - y);
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static float divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			System.out.println("Can not divide by 0");
		} else {
			divValue = x / y;
		}
		return divValue;

	}
	
}

