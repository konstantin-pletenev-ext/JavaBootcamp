package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        ta.catchExeption();
        try {
            ta.validateUser("Ivan");
        } catch (MyException e) {
            System.out.println(e.toString());
        }

        ta.catchMe(5,0);
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error");


        }

        System.out.println("This should get printed even if there is an exception");

    }

    void validateUser(String name) throws MyException {

        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        for (int i = 0; i < validUsers.length; i++) {

            if (name.equals(validUsers[i])) {
                System.out.println(validUsers[i] + " Welcome");
                flag = true;
                break;
            } else throw new MyException();
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
            System.out.println("Devide by zero");

        } finally {

            System.out.println("Thank you for using this program.");
        }
    }
}

