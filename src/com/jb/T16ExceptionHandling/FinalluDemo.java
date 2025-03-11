package com.jb.T16ExceptionHandling;

import java.util.Scanner;

public class FinalluDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
        
        int[] numbers={12,3,4,5};
        int number=numbers[2];
        System.out.println(number);
        //scanner.close(); //if not close - cause leakage
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Excetion Occurs");
        }
        finally
        {
            System.out.println("Before scanner close");
            scanner.close();
        }
        System.out.println("after scanner close");
    }
    
}
// 4
// Before scanner close
// after scanner close
