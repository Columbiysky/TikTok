package com.company;
import java.util.Scanner;

public class Main {

    private static char[][] CreateAndFillField(int size){
        char field[][] = new char[size][size];
        for (int i =0;i<3;i++)
            for(int j=0;j<3;j++)
                field[i][j]='*';

        return  field;
    }

    private static void PrintField(char field[][]){
        for(int i = 0 ; i < 3;i++)
            for (int j = 0; j< 3;j++)
                field[i][j]='*';
    }

    private static boolean Checker(char field[][], int row, int col){
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


    public static void main(String[] args) {
//        int size = 3;
//
//        char field[][] = CreateAndFillField(size);
//        PrintField(field);
//
//        System.out.println("Enter indeces.");
//
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        String temp;
//        char[] tempArray;
//
//        while(count<9) {
//
//            if (count%2==0) System.out.println("X turn!");
//            else  System.out.println("O turn!");
//
//            temp = sc.next();
//            tempArray = temp.toCharArray();
//
//
//            if(field[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] == 'o' ||
//                    field[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] == 'x')
//            {
//                System.out.println("These indices have been already used, select others!");
//
//                System.out.println();
//                PrintField(field);
//                System.out.println();
//            }
//
//            else
//            {
//                if (count %2 ==0)
//                    field[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] = 'x';
//
//                else
//                    field[Character.getNumericValue(tempArray[0]) - 1][Character.getNumericValue(tempArray[1]) - 1] = 'o';
//
//                System.out.println();
//                PrintField(field);
//                System.out.println();
//
//                if(Checker(field,Character.getNumericValue(tempArray[0]) - 1, Character.getNumericValue(tempArray[1]) - 1))
//                    if (count%2==0) {
//                        System.out.println("X WON!!!");
//                        break;
//                    }
//                    else  {
//                        System.out.println("O WON!!!");
//                        break;
//                    }
//
//                count++;
//            }
//        }
        Game g = new Game();
        while(true) {
            g.Play();
        }

    }
}
