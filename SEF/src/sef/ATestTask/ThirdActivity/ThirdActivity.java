package sef.ATestTask.ThirdActivity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        try {
            ta.validateUser("Ivan");
        } catch (IllegalArgumentException arg) {
            System.out.println("User could not be found in list!");
        }
            ta.catchExeption();
            ta.catchMe(7, 0);


    //*******************************************************************************************
    // Fibonacci number task
    /*
        ta.printFibonacci(1);
        ta.printFibonacci(2);
        ta.printFibonacci(7);
        ta.printFibonacci(54);
        ta.printFibonacci(-6);
        ta.printFibonacci(0);
    */
    //*******************************************************************************************
    }

    void catchExeption() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException bound) {
                System.out.println("Tried to access an array element that didn't exist!");
            }
        }
        System.out.println("This should get printed even if there is an exception");

    }

    void validateUser(String name) {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
        boolean flag = false;
        //TODO if name in a list -> set flag=true

        String user = "Peter";
        for(int i = 0; i < validUsers.length; i++) {
            if(validUsers[i] == user) {
                flag = true;
                break;
            }
        }
        // if at the end flag=0 -> throw the exeption

        if(flag != true) {
            throw new IllegalArgumentException();
        }else {
            System.out.println("Welcome, " + user + "!");
        }
    }

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption

            try {
                int result = num1/num2;
                System.out.println("The result is :" + result);
            } catch (ArithmeticException arit) {
                System.out.println("Cannot divide by zero!");
            }

            //TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");

    }

    //*******************************************************************************************
    // Fibonacci number method
    /*
        public void printFibonacci(int amount) {
            System.out.println();
            if (amount == 1) System.out.println("0");
            else if (amount == 2) System.out.println("0 1");
            else if (amount > 2) {
                long[] arr = new long[amount];
                arr[0] = 0;
                arr[1] = 1;
                System.out.print("0 1 ");
                for(int i = 2; i < amount; i++) {
                    arr[i] = arr[i-1] + arr[i-2];
                    System.out.print(arr[i] + " ");
                }
            } else System.out.println("Invalid amount given!");

        }
    */
    //*******************************************************************************************
}

