package sef.ATestTask.ThirdActivity;

import java.util.Scanner;

public class FabinachchiNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, please: ");
        long n = scanner.nextInt();
        long n0 = 1;
        long n1 = 1;
        long n2;
        System.out.print(n0 + " " + n1 + " ");
        for (long i = 3; i <= n; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
