package com.jb.T10ArrayArrayList;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListStudent 
{
    private ArrayList<Integer> marks = new ArrayList<Integer>();
        @SuppressWarnings("unused")
        private String name;
        public ArrayListStudent(String name, int... marks) 
        {
            this.name=name;
        for(int mark:marks)
        {
            this.marks.add(mark);
        }

    }
    public int getNumberOfMarks()
    {
        return marks.size();
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
        return Collections.max(marks);
    }
    public int getMinMarks()
    {
        return Collections.min(marks);
    }
    public BigDecimal getAverageOfMarks()
    {
        int total=getSumOfMarks();
        int totalMarks=getNumberOfMarks();
        // return new BigDecimal(total/totalMarks); // no decimal
        return new BigDecimal(total).divide(new BigDecimal(totalMarks)); //accurate
    }
    @Override
    public String toString() 
    {
        return name+" "+marks;
    }

    public void addNewMark(int mark)
    {
        marks.add(mark);
    }
    public void removeMarkAtIndex(int index)
    {
        marks.remove(index);
    }
        public static void main(String[] args) 
        {
            int [] marks ={98,99,100,97,98};
            ArrayListStudent student = new ArrayListStudent("jaya",marks);
            System.out.println("Number of Marks: "+student.getNumberOfMarks());
            System.out.println("sum of Marks: "+student.getSumOfMarks());
            System.out.println("Maximum Mark: "+student.getMaxMarks());
            System.out.println("Minimum Mark: "+student.getMinMarks());
            System.out.println("Average Mark: "+student.getAverageOfMarks());
            System.out.println("Name and Marks: "+student.toString());
      }

}
// Number of Marks: 5
// sum of Marks: 492
// Maximum Mark: 100
// Minimum Mark: 97
// Average Mark: 98.4