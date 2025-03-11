package com.jb.T05OOPS;
public class Planet1 
{
    private int speed;
    void setSpeed(int speed) 
    {
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
        Planet1 earth=new Planet1();
        Planet1 venus=new Planet1();

        earth.print();
        venus.print();
        System.out.println(earth.getSpeed());
        System.out.println(venus.getSpeed());
        earth.setSpeed(100);
        venus.setSpeed(20);
        System.out.println(earth.getSpeed());
        System.out.println(venus.getSpeed());

}
}
// Rotationg
// Rotationg
// 0
// 0
// 100
// 20