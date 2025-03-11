package com.jb.T08Loops;
import java.util.Scanner;
public class SumOfN_Numbers 
{
    private static int sumofN_Numbers(int number) 
    {
        int sum = 0;
        for(int i=1;i<=number;i++) //check number from to 2 to n number
        {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        System.out.println("Sum upto "+number+": "+sumofN_Numbers(number));
        scanner.close();
    }
}
// Enter Number: 6
// Sum upto 6: 21