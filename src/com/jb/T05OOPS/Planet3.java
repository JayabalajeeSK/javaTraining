package com.jb.T05OOPS;
public class Planet3
{
    private int speed;
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
        Planet3 earth=new Planet3();
        Planet3 venus=new Planet3();

        earth.print(); //ro
        venus.print(); //r0
        System.out.println(earth.getSpeed()); //0
        System.out.println(venus.getSpeed()); //0
        earth.setSpeed(10); 
        venus.setSpeed(-4); 
        System.out.println(earth.getSpeed()); //10
        System.out.println(venus.getSpeed()); //0
        earth.increaseSpeed(10); 
        venus.increaseSpeed(10); 
        venus.decreaseSpeed(5);
        System.out.println(earth.getSpeed()); //10+10=20
        System.out.println(venus.getSpeed()); //0+10-5=5

}
}
// Rotationg
// Rotationg
// 0
// 0
// 10
// 0
// 20
// 5