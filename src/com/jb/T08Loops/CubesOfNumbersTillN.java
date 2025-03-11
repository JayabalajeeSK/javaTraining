package com.jb.T08Loops;
import java.util.Scanner;
public class CubesOfNumbersTillN 
{
    public static void numberCubes(int number) 
    {
        int i=1;
        while(i*i*i<=number)
        {
            System.out.println(i*i*i);
            i++;
        }
    }
        public static void main(String[] args) 
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter Number: ");
            int number = scanner.nextInt();
            numberCubes(number);
        scanner.close();
    }
}
// Enter Number: 25
// 1
// 8