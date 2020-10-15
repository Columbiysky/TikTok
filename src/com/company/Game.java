package com.company;

import javax.swing.*;

public class Game {

    public Field field;
    public Player player1;
    public Player player2;
    private int turnCount = 0;
    public char currentMark;
    String temp;

    public Game(){
        field = new Field();
        player1 = new Player('x');
        player2 = new Player('o');
    }

    public void DoTurn(int row, int col){
        if(turnCount < field.size * field.size) {
            if (turnCount % 2 == 0) currentMark = player1.Mark;
            else currentMark = player2.Mark;

            if (field.GameField[row][col] != player1.Mark && field.GameField[row][col] != player2.Mark)
                field.GameField[row][col] = currentMark;
            else {
                JOptionPane.showMessageDialog(null, "This block already filled!!!");
                return;
            }

            if (Checker(field.GameField, row, col)) {
                if (turnCount % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "X WON!!!");
                    Runtime.getRuntime().exit(0);
                }
                else {
                    JOptionPane.showMessageDialog(null, "O WON!!!");
                    Runtime.getRuntime().exit(0);
                }
            }

            turnCount++;
        }
        else {
            JOptionPane.showMessageDialog(null, "TIE!!!");
            Runtime.getRuntime().exit(0);
        }
    }

    private boolean Checker(char field[][], int row, int col){
        char character = field[row][col];

        if((field[row][0] == character) && (field[row][1]== character) && (field[row][2] == character) ||
                (field[0][col] == character)&& (field[1][col] == character) && (field[2][col]== character))
            return true;

        else if(row == col ) {
            if ((field[0][0] == character) && (field[1][1] == character) && (field[2][2] == character))
                return  true;
        }

        else if (col==3-1-row) {
            if ((field[2][0] == character) && (field[1][1] == character) && (field[0][2] == character))
                return true;
        }

        return  false;
    }

    public void GUIPlay(){

    }

    public void Play(/*int FieldSize*/){
        field.Render();

        System.out.println("Enter indeces.");
        JOptionPane.showMessageDialog(null,"Enter indices!");

        int count = 0;
        char[] tempArray;

        while (count < field.size*field.size){

            if (count%2==0) System.out.println("X turn!");
            else  System.out.println("O turn!");

            tempArray = temp.toCharArray();

            if(field.GameField[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] == 'o' ||
                    field.GameField[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] == 'x')
            {
                System.out.println("These indices have been already used, select others!");


                System.out.println();
                field.Render();
                System.out.println();
            }

            else
            {
                if (count %2 ==0)
                    field.GameField[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] = 'x';

                else
                    field.GameField[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] = 'o';

                System.out.println();
                field.Render();
                System.out.println();

                if(Checker(field.GameField,Character.getNumericValue(tempArray[0]) - 1, Character.getNumericValue(tempArray[1]) - 1))
                    if (count%2==0) {
                        System.out.println("X WON!!!");
                        break;
                    }
                    else  {
                        System.out.println("O WON!!!");
                        break;
                    }

                count++;
            }
        }
    }
}
