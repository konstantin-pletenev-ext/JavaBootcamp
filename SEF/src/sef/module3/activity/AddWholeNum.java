/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 50; i <= 100; i++) {
			total += i; // the same as total = total + i
		}
		System.out.println("Addition of Whole Numbers from 50 to 100 = " + total);
	}
}