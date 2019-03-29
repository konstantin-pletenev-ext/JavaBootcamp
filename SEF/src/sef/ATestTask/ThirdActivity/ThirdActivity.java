package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import sef.ATestTask.FirstActivity.NewCustomException;

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way

        try {
            ta.validateUser("Ivan");
        } catch (NewCustomException e) {
            System.out.println(e.toString());
        }

        System.out.println("--------------------");
        ta.catchMe(100, 0);
        ta.catchMe(10, 5);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something goes wrong!");
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }


    void validateUser(String name) throws NewCustomException {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        for (int i = 0; i < validUsers.length; i++) {
            if (name.equals(validUsers[i])) {
                System.out.println("Welcome, " + validUsers[i]);
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new NewCustomException();
        }
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exeption
    }

    void catchMe(int num1, int num2) {
        //TODO Catch exeption
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Oooops! Divide by zero is not allowed!");
        } finally {
            System.out.println("Thank you for using this program.");
        }

        //TODO prints a message "Thank you for using this program." always

    }
}


