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

		//Summ
		int result = calculator.getSum(4, 5);
		System.out.println("Summ result = " + result);

		//Divide
		float divide = calculator.divide(4, 0);
		System.out.println("Division result = " + divide);

		//Multiply
		int mult = calculator.mult(5, 7);
		System.out.println("Multiplication result = " + mult);

		//Subtraction
		int sub = calculator.mult(5, 7);
		System.out.println("Subtraction result = " + sub);


	}

	//TODO create the Calculator (here or in additional class)
	public calculator(){}

	public int getSum(int a, int b) {
		return a + b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int sub(int a, int b) {
		return a - b;
	}


	public float divide(int a, int b) {
		if (b != 0) {
			return (float) a / (float) b;
		} else {
			return 0;
		}
	}

}
