package com.jb.T05OOPS;
public class Planet {
    int speed;
    public void print()
    {
        System.out.println(speed);
    }
    public static void main(String[] args) {
        Planet earth=new Planet();
        Planet venus=new Planet();
        earth.print();
        venus.print();
        earth.speed=100;
        earth.print();
        venus.print();
        earth.speed=120;
        venus.speed=20;
        earth.print();
        venus.print();
    }
    public void setSpeed(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSpeed'");
    }
    public char[] getSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpeed'");
    }
}
// 0
// 0
// 100
// 0
// 120
// 20