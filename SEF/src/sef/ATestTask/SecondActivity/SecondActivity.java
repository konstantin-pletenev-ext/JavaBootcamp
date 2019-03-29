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

		calculator.getSum(10,5);
		calculator.getDifference(10,5);
		calculator.getProduct(10,5);
		calculator.getQuotient(10,5);


	}

	//TODO create the Calculator (here or in additional class)
	public int getSum(int a, int b) { return a + b; }

	public int getDifference(int a, int b){
		return a - b;
	}

	public double getProduct(double a, double b) { return a * b; }

	public double getQuotient(double a, double b){ return a / b; }
}
