package com.jb.T08Loops;
import java.util.Scanner;
public class PrimeNumber 
{
    private static boolean isPrime(int number) 
    {
        //2,3,5,7,11,13,....
        for(int i=2;i<=number;i++) //check number from to 2 to n number
        {
            if(number%2==0) //check number divisble by any numbet from 2
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        System.out.println(number+" is prime number? \n"+isPrime(number));
        scanner.close();
    }
}
// Enter Number: 2
// 2 is prime number?
// false