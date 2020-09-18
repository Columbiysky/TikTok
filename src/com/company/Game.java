package com.company;

public class Game {

    public Field field;
    public Player player1;
    public Player player2;

    public Game(){
        field = new Field();
        player1 = new Player('x');
        player2 = new Player('o');
    }

    public void DoTurn(int TurnCount, int row, int col){
        if(TurnCount % 2 == 0)
            field.GameField[row][col] = player1.Mark;
        else
            field.GameField[row][col] = player2.Mark;

    }

    public void Play(){
        System.out.println("эщкере");
    }
}
