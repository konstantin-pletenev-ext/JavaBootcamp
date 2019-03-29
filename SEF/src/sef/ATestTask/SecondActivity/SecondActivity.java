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

		calculator.add(10, 15);
		calculator.substraction(45, 6);
		calculator.multiply(5,5);
		calculator.divide(5,7);

	}

	//TODO create the Calculator (here or in additional class)

	public static int add(int x, int y) {
		int sum = x + y;
		System.out.println("Summa first and second number = "+sum);
		return sum;

	}

	public static int substraction(int x, int y) {
		int substractionresult = x - y;
		System.out.println("Substraction first and second number = "+substractionresult);
		return substractionresult;

	}

	public static int multiply(int x, int y) {
		int sum = x * y;
		System.out.println("Myltiply first and second number = "+sum);
		return sum;

	}

	public static int divide ( int x, int y){
		int result = 0;
		if (y == 0) {
			System.out.println("not allowed to devide by 0");
		} else {
			result = x / y;
		}System.out.println("Myltiply first and second number = "+result);
		return result;

	}
}