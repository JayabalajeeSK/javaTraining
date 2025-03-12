package com.jb.T00CodingExercises;
import java.util.Scanner;
public class C20SumOfDigits {
        public static int sumOfDigits(int number)
        {
            if (number<0) {
                return -1;   
            }
            if (number==0) {
                return 0;   
            }
            int sumOfDigits=0;
            while(number>0)
            {
                int LastDigit = number%10;
                sumOfDigits=sumOfDigits+LastDigit;
                number=number/10;
            }
            return sumOfDigits;
        }
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number:"); 
            int number = scanner.nextInt();
            int result = sumOfDigits(number);
        if (result == -1) {
            System.out.println(" not defined for negative numbers.");
        } else {
            System.out.println("Sum of " + number + " Digits is: " + result);
        }
        scanner.close();
    }
}
// Enter any number:
// 17953
// Sum of 17953 Digits is: 25