package com.jb.T11OOPSAgain;

public class Rectangle {
    //state
    private int length;
    private int width;
    //behavior
    public Rectangle(int length, int width) {
            this.length=length;
            this.width=width;
        }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", area()=" + area() + ", perimeter()="
                + perimeter() + "]";
    }
    //action
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }

        public static void main(String[] args) {
            Rectangle rectangle=new Rectangle(12,13);
            System.out.println(rectangle);
    }
}
// Rectangle [length=12, width=13, area()=156, perimeter()=50]
