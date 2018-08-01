package sef.module8.sample;
// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	public static void test()
	{
		assert 5%2 ==1;
		assert 6%2  ==1 : "This is incorrect";
		//1 - Type assert 5 %2 and 6%2 in separate statements

		System.out.println ("I am here");
	}
	public static void main(String arg[]){
		//2 - Call test()
		AssertSample.test();
		//Something somewhere must be changed to get cirrec run. Assertions must be enabled or disabled
	}			
}

public class AssertSample {
	public static int test(int i, int k);

	{
		return i / k;
	}

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("Enter a number for divide, should not be 0");
		int k = input.nextInt();

		assert k != 0 : "You are not able to devide by zero";
		assert (x >= 0, &&k > 0):"one of numbers is less that zero x=" + x + "k =" + k;
		System.out.println("Result");
	}
}

