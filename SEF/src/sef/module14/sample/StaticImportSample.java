package sef.module14.sample;
//Complete Code
import static java.lang.Math.*;
public class StaticImportSample 
{
   public static void main(String args[]) 
   {
	 
	   //Use the fields in the Math class directly
	  System.out.println("The sin of Pi/4 is about " +sin(PI / 4));
	  System.out.printf("The sin of Pi/4 is about %f\n",sin(PI/4));
	  System.out.print("\n");
	  System.out.println("PI is approximately " + PI);
	  System.out.printf("PI is approximately %f\n",PI);
	  System.out.print("\n");
	  System.out.println("The square root of 25 is " + sqrt(25));
	  System.out.printf( "The square root of 25 is %.1f", sqrt(25.0) );
      

     
   } 
} 