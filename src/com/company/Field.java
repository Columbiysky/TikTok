package com.company;

public class Field {
     public int size =3;

     public char[][] GameField = new char[size][size];

     public Field(){
         GenerateField();
     }

     private void GenerateField(){
         for(int i = 0 ; i < size;i++)
             for (int j = 0; j< size;j++)
                 GameField[i][j]='*';
     }

     public void Render(){
         for (int i =0;i<3;i++){
             for(int j=0;j<3;j++){
                 System.out.print(GameField[i][j]);
             }
             System.out.println();
         }
     }
}
