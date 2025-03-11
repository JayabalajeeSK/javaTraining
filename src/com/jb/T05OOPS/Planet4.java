//abstraction & Constructor
package com.jb.T05OOPS;
public class Planet4
{
    private int speed;
    Planet4(int speed)
    {
        this.speed=speed;
    }

    void setSpeed(int speed) 
    {
        if(speed>0) //only print grater than 0
        {
            this.speed=speed;
        }
    }
    int getSpeed() 
    {
        return speed;
    }
    public void print()
    {
        System.out.println("Rotationg");
    }

    private void increaseSpeed(int howMuch)
    {
        // this.speed=this.speed+howMuch;
        setSpeed(this.speed+howMuch);
    }
    private void decreaseSpeed(int howMuch)
    {
        // this.speed=this.speed-howMuch;
        setSpeed(this.speed-howMuch);
    }
    public static void main(String[] args) 
{
        Planet4 earth=new Planet4(100);
        Planet4 venus=new Planet4(900);

        earth.print(); //ro
        venus.print(); //r0
        System.out.println(earth.getSpeed()); //100
        System.out.println(venus.getSpeed()); //900
        earth.setSpeed(10); 
        venus.setSpeed(-4); 
        System.out.println(earth.getSpeed()); //10
        System.out.println(venus.getSpeed()); //900
        earth.increaseSpeed(10); 
        venus.increaseSpeed(10); 
        venus.decreaseSpeed(5);
        System.out.println(earth.getSpeed()); //10+10=20
        System.out.println(venus.getSpeed()); //900+10-5=905

}
}
// Rotationg
// Rotationg
// 100
// 900
// 10
// 900
// 20
// 905