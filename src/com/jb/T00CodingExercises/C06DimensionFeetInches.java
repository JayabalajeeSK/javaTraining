package com.jb.T00CodingExercises;

public class C06DimensionFeetInches {

    

    private int inches;
    private int feet=0;;    
        public C06DimensionFeetInches(int inches) 
        {
            this.inches=inches;
        }
    
    public int getFeet() 
    {
       if(inches>=0)
       {
        feet=inches/12;
        return feet;
       }
       else return -1;
    }
    
    public int getInches() 
    {
        if(inches>=0)
        {
            int remInchOFFoot=0;
            remInchOFFoot=inches%12;
            return remInchOFFoot;
        }
        else return -1;
    }    
    public static void main(String[] args) {
        C06DimensionFeetInches dimensionFeetInches=new C06DimensionFeetInches(25);
        System.out.println(dimensionFeetInches.getFeet()); //2
        System.out.println(dimensionFeetInches.getInches()); //1
    }
}