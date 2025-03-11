package com.jb.T07Conditionals;
import java.util.Scanner;
public class IfandSwitch 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int number1 = scanner.nextInt(); //append the number
        System.out.print("Enter 2st number: ");
        int number2 = scanner.nextInt(); //append the number

        System.out.println("1st Number: "+number1);
        System.out.println("2nd Number: "+number2);
        System.out.println("Enter Choices: \n 1. Add \n 3. Sub \n 3. Mul \n 4. Div");
        System.out.print("Enter Choice Number: ");
        int choices = scanner.nextInt(); //append the number
        switch (choices) {
            case 1: 
            System.out.println("Addition of "+number1+" and "+number2);
            System.out.println(number1 + number2); break;
            case 2: 
            System.out.println("Subtraction of "+number1+" and "+number2);
            System.out.println(number1 - number2); break;
            case 3: 
            System.out.println("Multiply of "+number1+" and "+number2);
            System.out.println(number1 * number2); break;
            case 4: 
            System.out.println("Division of "+number1+" and "+number2);
            System.out.println(number1 / number2); break;
            default:
            if(choices<1 || choices>4)
            {
                System.out.println("Enter valid number!");
            }
            else System.out.println("Done!");
            break;
        }
        scanner.close();
    }
}
// Enter 1st number: 5
// Enter 2st number: 3
// 1st Number: 5
// 2nd Number: 3
// Enter Choices:
//  1. Add
//  3. Sub
//  3. Mul
//  4. Div
// Enter Choice Number: 3
// Multiply of 5 and 3
// 15