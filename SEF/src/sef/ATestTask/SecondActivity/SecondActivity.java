package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();

		//TODO Use the calculator to calculate different values
		System.out.println(calculator.add(7, 9));
		System.out.println(calculator.subtract(9, 5));
		System.out.println(calculator.mulitply(4, 14));
		System.out.println(calculator.divide(6, 3));
		System.out.println(calculator.divide(10, 0));


	}

	//TODO create the Calculator (here or in additional class)

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int mulitply(int a, int b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if(a == 0 || b == 0) {
			return 0;
		} else {
			return a / b;
		}
	}
}
