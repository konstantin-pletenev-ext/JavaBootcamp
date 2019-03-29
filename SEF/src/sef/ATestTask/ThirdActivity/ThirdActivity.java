package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import junit.framework.TestCase;

public class ThirdActivity extends TestCase {

    public static void main(String[] args) throws Exception {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.validateUser("Ivan");
        ta.catchExeption();
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
        System.out.println("This should get printed even if there is an exception");

    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exeption

        String validUser;
        validUser = "Mike";

        for (int i = 0; i < validUsers.length; i++) {
            if (validUsers[i] == validUser) {
                flag = true;
            }
        }
        if (!flag) {
            throw new Exception("");
        }
    }

    void catchMe(int num1, int num2) {
        //TODO Catch exeption
            int result = num1 / num2;
            System.out.println("The result is :" + result);

        //TODO prints a message "Thank you for using this program." always
        System.out.println("Thank you for using this program.");

    }
}

