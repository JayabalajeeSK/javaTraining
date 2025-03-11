package com.jb.T10ArrayArrayList;
import java.math.BigDecimal;
public class Student 
{
    private int[] marks;
    public Student(String name, int[] marks) 
    {
        this.marks=marks;

    }
    public int getNumberOfMarks()
    {
        return marks.length;
    }
    public int getSumOfMarks()
    {
        int sum=0;
        for(int mark:marks)
        {
            sum=sum+mark;
        }
        return sum;
    }
    public int getMaxMarks()
    {
        int max=0;
        for(int mark:marks)
        {
            if(mark>max)
            {
                max=mark;
            }
        }
        return max;
    }
    // public int getMinMarks()
    // {
    //     int max=getMaxMarks();
    //     for(int mark:marks)
    //     {
    //         if(mark<max) // > max;  opp < min mark
    //         {
    //             max=mark;
    //         }
    //     }
    //     return max;
    // }
    public int getMinMarks()
    {
        int max=Integer.MAX_VALUE;
        int min = max;
        for(int mark:marks)
        {
            if(mark<min) // > max;  opp < min mark
            {
                min=mark;
            }
        }
        return min;
    }
    public BigDecimal getAverageOfMarks()
    {
        int total=getSumOfMarks();
        int totalMarks=getNumberOfMarks();
        // return new BigDecimal(total/totalMarks); // no decimal
        return new BigDecimal(total).divide(new BigDecimal(totalMarks)); //accurate
    }
        public static void main(String[] args) 
        {
            int [] marks ={98,99,100,97,98};
            Student student = new Student("jaya",marks);
            System.out.println("Number of Marks: "+student.getNumberOfMarks());
            System.out.println("sum of Marks: "+student.getSumOfMarks());
            System.out.println("Maximum Mark: "+student.getMaxMarks());
            System.out.println("Minimum Mark: "+student.getMinMarks());
            System.out.println("Average Mark: "+student.getAverageOfMarks());
      }
}
// Number of Marks: 5
// sum of Marks: 492
// Maximum Mark: 100
// Minimum Mark: 97
// Average Mark: 98.4