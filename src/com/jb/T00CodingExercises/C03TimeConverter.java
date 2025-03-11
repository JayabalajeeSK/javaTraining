package com.jb.T00CodingExercises;
public class C03TimeConverter 
{
        public static int convertHoursToMinutes(int hours) 
        {
            return hours*60;
        }
        public static int convertDaysToMinutes(int days) 
        {
            if(days<0)
            {
                return -1;
            }
            return days*24*60;
        }
        @SuppressWarnings("unused")
        public static void main(String[] args)
        {
            C03TimeConverter hoursCon = new C03TimeConverter();
            C03TimeConverter dayCon = new C03TimeConverter();
            System.out.println(C03TimeConverter.convertHoursToMinutes(2));
            System.out.println(C03TimeConverter.convertDaysToMinutes(2));
    }
}
// 120
// 2880