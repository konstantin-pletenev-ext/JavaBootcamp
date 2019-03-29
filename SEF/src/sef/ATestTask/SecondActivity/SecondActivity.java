package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {


		SecondActivity calculator = new SecondActivity();
		System.out.println(getSum(10,5));
		System.out.println(getDif(10,5));
		System.out.println(getDivide(10,5));
		System.out.println(getMult(10,5));

		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		//calculator.divide(100, 33);
		// and more

	}

	//TODO create the Calculator (here or in additional class)


	public static double getSum(double x,double y){return  x+y;}
	public static double getDif(double x,double y){return x-y;}
	public static double getDivide(double x,double y){if (y==0) return 0;	else return x/y;}
	public static double getMult(double x,double y){return x*y;}

}
