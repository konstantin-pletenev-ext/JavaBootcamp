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

		Calculator myCalculator = new Calculator();

		myCalculator.getSum(10.2, 5);
		myCalculator.getDifference(100, 33);
		myCalculator.getProduct(3, 12);
		myCalculator.getQuotient(50, 5);

	}

	//TODO create the Calculator (here or in additional class)
	// see Calculator class

}
