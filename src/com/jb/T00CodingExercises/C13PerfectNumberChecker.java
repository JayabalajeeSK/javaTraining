package com.jb.T00CodingExercises;

public class C13PerfectNumberChecker 
{
    public boolean isPerfectNumber(int number) {
        if(number<=0)
        {
            return false;
        }
        int perfect=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                perfect=perfect+i;
            }
            if(perfect==number)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        C13PerfectNumberChecker c13PerfectNumberChecker=new C13PerfectNumberChecker();
        System.out.println(c13PerfectNumberChecker.isPerfectNumber(6));
    }
}
//true