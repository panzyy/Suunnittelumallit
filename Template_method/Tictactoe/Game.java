/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tictactoe;

/**
 *
 * @author panzyy
 */
public abstract class Game {
    
    protected int players;
    
    abstract void initializeGame();
    
    abstract void makePlay();
    
    abstract boolean endOfGame();
    
    abstract void printWinner();
    
    //Template method
    public final void playOneGame(){
        initializeGame();
        int j = 0;
        while (!endOfGame()){
            makePlay();
        }
        printWinner();
    }
}
