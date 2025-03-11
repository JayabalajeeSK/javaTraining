package com.jb.T11OOPSAgain;

public class ChessGame implements GamingConsole
{

    @Override
    public void up() {
    System.out.println("Move Piece UP");    
    }

    @Override
    public void down() {
        System.out.println("Move Piece DDown");   
    }

    @Override
    public void left() {
        System.out.println("Move Piece Left");   
    }

    @Override
    public void right() {
        System.out.println("Move Piece Right");   
      }
    
}
