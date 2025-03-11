package com.jb.T00CodingExercises;
public class C07SquareAreaPerimeter {
    private int side;
    public C07SquareAreaPerimeter(int side) {
        this.side=side;
    }

    public int calculateArea() {
        if(side>0)
        {
            return side*side;
        }
        else return -1;
    }
    public int calculatePerimeter() {
        if(side>0)
        {
            return 4*side;
        }
        else return -1;        
    }
    public static void main(String[] args) {
        C07SquareAreaPerimeter squareAreaPerimeter=new C07SquareAreaPerimeter(5);
        System.out.println(squareAreaPerimeter.calculateArea()); //25
        System.out.println(squareAreaPerimeter.calculatePerimeter()); //20
    }
}