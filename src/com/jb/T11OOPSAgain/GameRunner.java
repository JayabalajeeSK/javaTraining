package com.jb.T11OOPSAgain;

public class GameRunner {
    public static void main(String[] args) {
       //GamingConsole game=new MarioGame();
       //GamingConsole game= new ChessGame();
       GamingConsole[] games = {new ChessGame(), new MarioGame()};
       for(GamingConsole game:games)
       {
        game.up();
        game.down();
        game.left();
        game.right();
       } 
    }
    
}
// Move Piece DDown
// Move Piece Left
// Move Piece Right
// jump
// goes into hole
// go back
// go front

//chess
// Move Piece UP
// Move Piece DDown
// Move Piece Left
// Move Piece Right

//mario
// jump
// goes into hole
// go back
// go front