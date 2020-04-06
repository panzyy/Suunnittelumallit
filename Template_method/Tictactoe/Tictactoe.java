/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tictactoe;

import java.util.Scanner;

/**
 *
 * @author panzyy
 */
public class Tictactoe extends Game{
    private char playerMark;
    private char[][] board;
    

    public Tictactoe() {
        board = new char[3][3];
        playerMark = 'x';
        initializeBoard();
    }
    
    

    @Override
    void initializeGame() {
        Tictactoe ttt = new Tictactoe();
    }

    @Override
    void makePlay() {
        System.out.println("Anna x ja y koordinaatit välillä 0-2");
        Scanner lukija = new Scanner(System.in);
        int i = lukija.nextInt();
        int j = lukija.nextInt();
        placeMark(i, j);
        changePlayerMark();
        printBoard();
    }

    @Override
    boolean endOfGame() {
        return checkForWin() == true || isBoardFull() == true;
    }

    @Override
    void printWinner() {
        if (isBoardFull() && !checkForWin()) {
            System.out.println("The game was a tie!");
        }
        else {
            System.out.println("Current board layout: ");
            printBoard();
            changePlayerMark();
            System.out.println(Character.toUpperCase(getPlayerMark()) + " Wins!");
        }
    }
    
    public void initializeBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }
    
        
    public void printBoard(){
        System.out.println("-----BOARD TOP-----");
        for (int i = 0; i < 3; i++){
            System.out.print("| ");
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("----------");
        }
        System.out.println("-----BOARD BOTTOM-----");
    }
    
    public void changePlayerMark(){
        if(playerMark == 'x'){
            playerMark = 'o';
        }
        else {
            playerMark = 'x';
        }
    }
    
    public boolean placeMark(int row, int col){
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)){
                if (board[row][col] == '-'){
                    board[row][col] = playerMark;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isBoardFull(){
        boolean full = true;
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                if (board[i][j] == '-'){
                    full = false;
                }
            }
        }
        return full;
    }
    
    public boolean checkRowCol(char c1, char c2, char c3){
        return (c1 != '-' && c1 == c2 && c2 == c3);

    }
    
    private boolean checkDiagonalsWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
                || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }
    
    private boolean checkColumnsWin(){
        for (int i = 0; i < 3; i++){
            if ((checkRowCol(board[0][i], board[1][i], board[2][i]) == true)){
                return true;
            }
        }
        return false;
    }
    
    private boolean checkRowsWin(){
        for (int i = 0; i<3; i++){
            if ((checkRowCol(board[i][0], board[i][1], board[i][2]) == true)){
                return true;
            }
        }
        return false;
    }

    private boolean checkForWin(){
        return (checkRowsWin() || checkColumnsWin() || checkDiagonalsWin());
    }

    public char getPlayerMark() {
        return playerMark;
    }

}
