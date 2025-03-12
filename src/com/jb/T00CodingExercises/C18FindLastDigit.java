package com.jb.T00CodingExercises;

import java.util.Scanner;

public class C18FindLastDigit {

    public static int getLastDigit(int number)
        {
            if (number<0) {
                return -1;   
            }
            int last_rem = number% 10;
            return last_rem;
        }
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number:"); 
            int number = scanner.nextInt();
            int result = getLastDigit(number);
        if (result == -1) {
            System.out.println(" not defined for negative numbers.");
        } else {
            System.out.println("Last Digit of " + number + " is: " + result);
        }
        scanner.close();
    }
}
// 72693
// Last Digit of 72693 is: 3