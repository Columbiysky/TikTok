package com.company;

import java.util.Objects;
import java.util.Scanner;

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

    public void Play(/*int FieldSize*/){
        field.Render();

        System.out.println("Enter indeces.");

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String temp;
        char[] tempArray;

        while (count < field.size*field.size){

            if (count%2==0) System.out.println("X turn!");
            else  System.out.println("O turn!");

            temp = sc.next();
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
