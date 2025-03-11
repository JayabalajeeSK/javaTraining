package com.jb.T08Loops;
import java.util.Scanner;
public class SumOfDivisorOfN 
{
    private static int sumofN_Numbers(int number) 
    {
        int sum = 0;
        for(int i=1;i<=number;i++) // include 1(first) and last divisor --- i=2;i<number;i++ - for divisor between first and last
         {
            if(number%i==0)
            {
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of Divisor of "+number+": "+sumofN_Numbers(number));
        scanner.close();
    }
}
// Enter Number: 6  (1x2,2x3,3x2,6x1)
// Sum of Divisor of 6: 12 (1+2+3+6)