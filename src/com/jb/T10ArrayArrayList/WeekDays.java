package com.jb.T10ArrayArrayList;

public class WeekDays 
{
    public static void main(String[] args) 
    {
        String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        String dayWithMostChar="";
        for(String day:days)
        {
            if(day.length()>dayWithMostChar.length())
            {
                dayWithMostChar=day;
            }
        }
        System.out.println("Day with most number of Characters: "+dayWithMostChar);
        for(int i=days.length-1;i>=0;i--)
        {
            System.out.println(days[i]);
        }
    }
}
// Day with most number of Characters: wednesday
// saturday
// friday
// thursday
// wednesday
// tuesday
// monday
// sunday