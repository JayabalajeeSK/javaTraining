package com.jb.T06DataTypes;
public class Integer 
{
    private int a;
    private int b;
    Integer(int a, int b)
    {
        this.a=a;
        this.b=b;

    }
    public int add()
    {
        return a+b;
    }
    public int multi()
    {
        return a*b;
    }
    public static void main(String[] args) {
    Integer calc= new Integer(8,7);
    System.out.println(calc.add()); //15
    System.out.println(calc.multi()); //56
    int i = 10000;
    long l = 50000000000l;
    i =(int) l;
    System.out.println(i); //-1539607552
    int a = 10; 
    int b = a++; //10 //post - increment
    System.out.println(b); //11
    int c = 10;
    int d= ++c;  //11// pre - increment
    System.out.println(d); //11
    }
}