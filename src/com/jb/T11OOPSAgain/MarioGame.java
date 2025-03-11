package com.jb.T11OOPSAgain;

public class MarioGame implements GamingConsole
{

    @Override
    public void up() {
    System.out.println("jump");    
    }

    @Override
    public void down() {
        System.out.println("goes into hole");   
    }

    @Override
    public void left() {
        System.out.println("go back");   
    }

    @Override
    public void right() {
        System.out.println("go front");   
      }
    
}
