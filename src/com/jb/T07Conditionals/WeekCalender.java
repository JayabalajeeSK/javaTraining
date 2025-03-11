package com.jb.T07Conditionals;
import java.util.Scanner;
public class WeekCalender 
{
    public static boolean isWeekday(int day)
    {
        if(day>=2 && day <=6)
        {
            return true;  
        }
        else return false;
    }

    public static String nameOfDay(int day)
    {
        if(day>=1 && day <=7)
        {
            switch (day) 
            {
                default: return day+" is";
                case 1: return "Sunday"; 
                case 2: return "monday";
                case 3: return "tuesday"; 
                case 4: return "wednesday"; 
                case 5: return "thursday"; 
                case 6: return "friday"; 
                case 7: return "Saterday"; 
            }
        }
        else return "Enter valid day number (1-7)!";
    }

    public static String nameOfMonth(int month)
    {
        if(month>=1 && month <=12)
        {
            switch (month) 
            {
                default: return month+" is";
                case 1: return "jan"; 
                case 2: return "feb";
                case 3: return "mar"; 
                case 4: return "apr"; 
                case 5: return "may"; 
                case 6: return "june"; 
                case 7: return "july";
                case 8: return "aug";
                case 9: return "sep";
                case 10: return "oct";
                case 11: return "nov";
                case 12: return "dec";

            }
        }
        else return "Enter valid month number (1-12)!";
    }
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day (1-7): ");
        int day = scanner.nextInt();
        System.out.println("Enter Month (1-12)");
        int month = scanner.nextInt();

        if(isWeekday(day))
        {
            System.out.println(day+"th day is week day");
        }
        else System.out.println(day+"th day is not week day");
        System.out.println(nameOfDay(day));
        System.out.println(nameOfMonth(month));
        scanner.close();
    }
}
// Enter day (1-7): 
// 4
// Enter Month (1-12)
// 10
// 4th day is week day
// wednesday
// oct