package sef.ATestTask.ThirdActivity;

//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        // handle exception on proper way
        try {
            ta.validateUser("Ivan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ta.catchExeption();
        ta.catchMe(10, 2);
        ta.catchMe(10, 0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }

    void validateUser(String name) throws Exception {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        // if name in a list -> set flag=true
        // if at the end flag=0 -> throw the exception
        for (String validUser: validUsers) {
            if (validUser.equals(name)){
                flag = true;
                break;
            }
        }

        if (!flag){
            throw new Exception("Invalid user");
        }
    }

    void catchMe(int num1, int num2) {
        // Catch exception
        try {
            int result = num1 / num2;
            System.out.println("The result is " + result);
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            // prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
        }

    }
}

