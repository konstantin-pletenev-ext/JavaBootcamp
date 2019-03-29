package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

		System.out.println(getSum(10.2, 5));
		System.out.println(getDifference(11, 5));
		System.out.println(getQuotient(15, 3));
		System.out.println(getProduct(100, 33));

	}

	//TODO create the Calculator (here or in additional class)

	public static double getSum(double x, double y) {
		return x + y;
	}

	public static double getDifference(double x, double y) {
		return (x - y);
	}

	public static double getProduct(double x, double y) {
		return x * y;
	}

	public static double getQuotient(double x, double y) {
		if (y == 0)
				return 0;
		return x / y;
	}
}


