package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) throws CustomException {
        ThirdActivity a = new ThirdActivity();
        //TODO handle exception on proper way
        a.validateUser("Missi");

        System.out.println("********************");
        a.catchMe(100, 0);
        System.out.println("********************");
        a.catchMe(10, 5);
        System.out.println("********************");
        a.catchException();
        System.out.println("********************");
    }

    void catchException() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something is wrong! Check the array size!");
        } finally {
            System.out.println("This should get printed even if there is no exception, so you mat not worry.");
        }
    }

    void validateUser(String name) throws CustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception
        for (int i = 0; i < validUsers.length; i++) {
            if (name.equals(validUsers[i])) {
                System.out.println("Welcome, " + validUsers[i] + "!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new CustomException();
        }
    }

    void catchMe(int x, int y) {
        //TODO Catch exception
        try {
            int result = x / y;
            System.out.println(x + " + " + y + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        } finally {
            System.out.println("Thank you for using this division program!");
        }

    }


}

