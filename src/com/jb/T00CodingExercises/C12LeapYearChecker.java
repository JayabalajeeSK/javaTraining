package com.jb.T00CodingExercises;
public class C12LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year<=0)
        {
            return false;
        }
        if(year % 4 != 0) // not divisible by 4 is not leap year
        {
            return false;
        }
        if(year % 4 == 0 && year %100 != 0) // divisible by 4 and not divisible by 100 is leap year
        {
            return true;
        }
        if(year % 4 == 0 && year %100 == 0) // divisible by 4 and divisible by 100 then divisible by 400 is leap year
        {
            if (year%400==0) 
            {
                return true;
            }
            else return false;
        }
       return false;
    }
    public static void main(String[] args) {
        C12LeapYearChecker c12LeapYearChecker=new C12LeapYearChecker();
        System.out.println(c12LeapYearChecker.isLeapYear(2048));
    }
}