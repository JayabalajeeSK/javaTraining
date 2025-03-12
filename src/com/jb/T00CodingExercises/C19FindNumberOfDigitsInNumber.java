package com.jb.T00CodingExercises;
import java.util.Scanner;
public class C19FindNumberOfDigitsInNumber {
    public static int getNumberOfDigit(int number)
        {
            if (number<0) {
                return -1;   
            }
            if (number==0) {
                return 1;   
            }
            int noOfDigit=0;
            while(number>0)
            {
                number = number/10;
                noOfDigit++;
            }
            return noOfDigit;
        }
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number:"); 
            int number = scanner.nextInt();
            int result = getNumberOfDigit(number);
        if (result == -1) {
            System.out.println(" not defined for negative numbers.");
        } else {
            System.out.println("Number of Digit in " + number + " is: " + result);
        }
        scanner.close();
    }
}
// Enter any number:
// 347637
// Number of Digit in 347637 is: 6