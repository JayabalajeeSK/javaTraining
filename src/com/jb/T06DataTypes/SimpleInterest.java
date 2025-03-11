package com.jb.T06DataTypes;

import java.math.BigDecimal;

public class SimpleInterest //si=(p*n*r)/100 Total = P + SI
{
     BigDecimal principle;
     BigDecimal interest;
        
            public SimpleInterest(String principle, String interest) 
            {
                this.principle=new BigDecimal(principle);
                this.interest=new BigDecimal(interest).divide(new BigDecimal(100)); 
            }
            public BigDecimal calcTotalyear(int noOfYears)
            {
            BigDecimal noOfYearsBig= new BigDecimal(noOfYears);
            return principle.add(principle.multiply(interest).multiply(noOfYearsBig)); //P+(p*(r/100)*n)
            }
    
        public static void main(String[] args) 
        {
         SimpleInterest calc= new SimpleInterest("4500.00","7.5"); // by calculation divide by 100
         BigDecimal totalyear = calc.calcTotalyear(5);
         System.out.println(totalyear);   //6187.50000
        }
    
}
