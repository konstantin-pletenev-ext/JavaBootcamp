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

		int x = 15;
		int y = 13;
		int z = 5;

		System.out.println("Sum is - " + sum(x, y));
		System.out.println("Multiply - " + mul(x, y));
		System.out.println("Subtraction - " + sub(x, y));
		System.out.println("Divide - " + div(x, z));
	}
	//TODO create the Calculator (here or in additional class)

	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	public static int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}
	public static int mul(int x, int y){
		int mul = x * y;
		return mul;
	}
	public static int div(int x, int z){
		int div = x / z;
		return div;
	}
}
