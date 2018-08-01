/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				
		int i = 24;
		String numText = "";

		switch(i) {
		
		case 1:
			numText = "ONE";break;
		case 2:
			numText = "TWO";break;
		case 3:
			numText = "THREE";break;
		case 4:
			numText = "FOUR";break;
		case 5:
			numText = "FIVE";break;
		// complete the code.
		default:
			numText = "NUMBER " + i;
		}
		
		System.out.println(numText);


		if (i == 1)
			numText = "ONE";
		if (i == 2)
			numText = "TWO";
		if (i == 3)
			numText = "THREE";
		if (i == 4)
			numText = "FOUR";
		if (i == 5)
			numText = "FIVE";
		else
			numText = "NUMBER " + i;
	}
}
