package sef.ATestTask.BobusActivity;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> fib;
        System.out.print("Enter n: ");
        try {
            fib = getFibonacciSequence(sc.nextInt());
            for (Long n: fib) {
                System.out.print(n + " ");
            }
        } catch (Exception e){
            System.out.println(e.getClass() + " : " + e.getMessage());
        }
    }

    public static ArrayList<Long> getFibonacciSequence(int i){
        ArrayList<Long> fibonacci = new ArrayList<>();
        if (i > 93){
            i = 93;
        }
        if (i >= 1){
            fibonacci.add(0L);
        }
        if (i >= 2){
            fibonacci.add(1L);
        }
        for (int j = 2; j < i; j++){
            fibonacci.add(fibonacci.get(j - 1) + fibonacci.get(j - 2));
        }
        return fibonacci;
    }
}
