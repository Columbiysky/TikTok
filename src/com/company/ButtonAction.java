package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    JButton b;
    char [] m;
    Game g;
    Field f;
    public ButtonAction(JButton bt, String indices, Game gg){
        this.b = bt;
        this.m=indices.toCharArray();
        this.g = gg;
        this.f = g.field;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        g.DoTurn(Character.getNumericValue(m[0]) - 1, Character.getNumericValue(m[1]) - 1);
        char c = f.GameField[Character.getNumericValue(m[0]) - 1][Character.getNumericValue(m[1]) - 1];
        b.setText(Character.toString(c));
    }


}
