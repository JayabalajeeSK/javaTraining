package com.jb.T11OOPSAgain;
public class Fan {
    //state
    //basic
    private String make;
    private double radius;
    private String color;
    //other
    private boolean isOn;
    private byte speed; //1 -5
    //constructor - 
    public Fan(String make, double radius, String color) 
    {
        this.make=make; this.radius=radius; this.color=color;        
    }
    @Override
    public String toString() {
        //return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed="+ speed + "]";
        return String.format("make- %s , radius- %f ,color- %s ,isOn- %b ,speed- %d", make,radius,color,isOn,speed);
    }
    //States
    //isOn
    public void switchOn()
    {
        this.isOn=true;
        setSpeed((byte)5);
    }
    public void switchOff()
    {
        this.isOn=false;
        setSpeed((byte)0);

    }
    public void setSpeed(byte speed)
    {
        this.speed=speed;
    }
        public static void main(String[] args) {
            Fan fan=new Fan("Manufact 1",7.537,"brown");
            System.out.println(fan);
            fan.switchOn();
            System.out.println(fan);
            fan.setSpeed((byte)4); //integer -> byte - type cast
            System.out.println(fan);
            fan.switchOff();
            System.out.println(fan);
    }
}
// make- Manufact 1 , radius- 7.537000 ,color- brown ,isOn- false ,speed- 0
// make- Manufact 1 , radius- 7.537000 ,color- brown ,isOn- true ,speed- 5
// make- Manufact 1 , radius- 7.537000 ,color- brown ,isOn- true ,speed- 4
// make- Manufact 1 , radius- 7.537000 ,color- brown ,isOn- false ,speed- 0
