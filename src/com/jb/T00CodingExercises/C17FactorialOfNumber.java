package com.jb.T00CodingExercises;

import java.util.Scanner;

public class C17FactorialOfNumber {
    public static int calculateFactorial(int number) {
        if (number < 0) {
            return -1; 
        }
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:"); // Correct position
        int number = scanner.nextInt();
        int result = calculateFactorial(number);
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + result);
        }
        scanner.close();
    }
}
