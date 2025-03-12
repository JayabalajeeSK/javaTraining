package com.jb.T00CodingExercises;
import java.util.Scanner;
public class C21ReverseNumber {
        public static int reverseOfNumber(int number)
        {
            if (number<0) {
                return -1;   
            }
            if (number==0) {
                return 0;   
            }
            int reverseOfNumber=0;
            while(number>0)
            {
                int lastDigit= number%10;
                reverseOfNumber = reverseOfNumber * 10+lastDigit;
                number=number/10;
                System.out.format("digit - %d, number - %d, reversedNumber - %d",lastDigit, number, reverseOfNumber).println();
            }
            return reverseOfNumber;
        }
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number:"); 
            int number = scanner.nextInt();
            int result = reverseOfNumber(number);
        if (result == -1) {
            System.out.println(" not defined for negative numbers.");
        } else {
            System.out.println("Reverse of " + number + " is: " + result);
        }
        scanner.close();
    }
}
// Enter any number:
// 768
// digit - 8, number - 76, reversedNumber - 8
// digit - 6, number - 7, reversedNumber - 86
// digit - 7, number - 0, reversedNumber - 867
// Reverse of 768 is: 867