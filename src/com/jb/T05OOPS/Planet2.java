package com.jb.T05OOPS;
public class Planet2
{
    private int speed;
    void setSpeed(int speed) 
    {
        System.out.println(speed);
        System.out.println(this.speed);
        this.speed = speed;
    }
    int getSpeed() 
    {
        return speed;
    }
    public void print()
    {
        System.out.println("Rotationg");
    }
    public static void main(String[] args) 
{
        Planet2 earth=new Planet2();
        Planet2 venus=new Planet2();

        earth.print(); //ro
        venus.print(); //r0
        System.out.println(earth.getSpeed()); //0
        System.out.println(venus.getSpeed()); //0
        earth.setSpeed(100); //100, 0(default Speed 0) - call method
        venus.setSpeed(20);  //20 , 0
        System.out.println(earth.getSpeed()); //100
        System.out.println(venus.getSpeed()); //20

}
}
// Rotationg
// Rotationg
// 0
// 0
// 100
// 0
// 20
// 0
// 100
// 20