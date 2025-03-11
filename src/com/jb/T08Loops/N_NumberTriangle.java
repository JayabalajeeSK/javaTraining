package com.jb.T08Loops;
import java.util.Scanner;
public class N_NumberTriangle 
{
    public static void numberTriangle(int number) 
        {
            for(int i=1;i<=number;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        public static void main(String[] args) 
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter Number: ");
            int number = scanner.nextInt();
            numberTriangle(number);
        scanner.close();
    }
}
// 1
// 12
// 123
// 1234
// 12345
// 123456