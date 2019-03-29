package sef.ATestTask.SecondActivity;

import com.sun.javafx.css.CalculatedValue;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		// SecondActivity calculator = new SecondActivity();
		CalculatorFunction calc = new CalculatorFunction();

		calc.getDifference(2.4, 9.4);
		calc.getDivide(3.3, 6);
		calc.getMultiply(5, 7);
		calc.getSum(6, 9);

		System.out.println("Difference result is " +calc.getDifference(2.4, 9.4));
		System.out.println("Sum result is " +calc.getSum(2.4, 9.4));
		System.out.println("Divide result is " +calc.getDivide(2.4, 9.4));
		System.out.println("Multiply result is " +calc.getMultiply(2.4, 9.4));

		}



		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more


		//TODO create the Calculator (here or in additional class)

	}

