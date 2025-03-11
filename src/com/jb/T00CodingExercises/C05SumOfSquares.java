package com.jb.T00CodingExercises;
public class C05SumOfSquares {
    public long calculateSumOfSquares(int n) 
    {
        long sum =0;
        if(n>=0)
        {
            for(int i=0;i<=n;i++)
            {
                long square=i*i;
                sum=sum+square;
            }
            return sum;
        }
        else return -1;
    }
    public static void main(String[] args) 
    {
        C05SumOfSquares sumOfSquares = new C05SumOfSquares();
        System.out.println(sumOfSquares.calculateSumOfSquares(3)); //14
    }
}
