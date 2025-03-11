package com.jb.T08Loops;
import java.util.Scanner;
public class FindCubeNumber 
{
        public static void main(String[] args) 
        {
            Scanner scanner=new Scanner(System.in);
            int number=0;
            do
            {
                System.out.print("Enter Number: ");
                number = scanner.nextInt();
                System.out.println(number*number*number);
            }
            while(number>=0);
            scanner.close();
        }
}
// Enter Number: 3
// 27
// Enter Number: 2
// 8
// Enter Number: 5
// 125
// Enter Number: 0
// 0
// Enter Number: 2
// 8
// Enter Number: -1
// -1