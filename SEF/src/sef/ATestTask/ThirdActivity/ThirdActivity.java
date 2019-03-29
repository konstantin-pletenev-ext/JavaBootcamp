package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import static org.junit.Assert.assertEquals;

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
        ta.testThrowException();
    }

    public static void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr[i]);
        }}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Here's an exception");
        }
        finally {
            System.out.println("This should get printed even if there is an exception");
        }


    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exeption
    }


    // //TODO Catch exeption

   public double getDivide (double a, double b) {
       if (b == 0)
           throw new IllegalArgumentException("Divided by 0");
       return a / b;
   }
    public void testThrowException(){
        try{
            System.out.println("The result is "+ getDivide(2,5));
            System.out.println("The result is "+ getDivide(2,8));
        }
        catch (IllegalArgumentException e) {
            assertEquals("Divided by 0", e.getMessage());
        }
        finally { //TODO prints a message "Thank you for using this program." always
                System.out.println("Thank you for using this program.");
            }

    }
}

