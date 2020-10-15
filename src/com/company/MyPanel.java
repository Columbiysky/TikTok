package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(Game g) {
        setLayout(new GridLayout(3, 0, 5, 12));

        JButton btn1 = new JButton("*");
        JButton btn2 = new JButton("*");
        JButton btn3 = new JButton("*");
        JButton btn4 = new JButton("*");
        JButton btn5 = new JButton("*");
        JButton btn6 = new JButton("*");
        JButton btn7 = new JButton("*");
        JButton btn8 = new JButton("*");
        JButton btn9 = new JButton("*");

        btn1.setName("11");
        btn2.setName("12");
        btn3.setName("13");
        btn4.setName("21");
        btn5.setName("22");
        btn6.setName("23");
        btn7.setName("31");
        btn8.setName("32");
        btn9.setName("33");

        ButtonAction ba1 = new ButtonAction(btn1, btn1.getName(), g);
        ButtonAction ba2 = new ButtonAction(btn2, btn2.getName(), g);
        ButtonAction ba3 = new ButtonAction(btn3, btn3.getName(), g);
        ButtonAction ba4 = new ButtonAction(btn4, btn4.getName(), g);
        ButtonAction ba5 = new ButtonAction(btn5, btn5.getName(), g);
        ButtonAction ba6 = new ButtonAction(btn6, btn6.getName(), g);
        ButtonAction ba7 = new ButtonAction(btn7, btn7.getName(), g);
        ButtonAction ba8 = new ButtonAction(btn8, btn8.getName(), g);
        ButtonAction ba9 = new ButtonAction(btn9, btn9.getName(), g);

        btn1.addActionListener(ba1);
        btn2.addActionListener(ba2);
        btn3.addActionListener(ba3);
        btn4.addActionListener(ba4);
        btn5.addActionListener(ba5);
        btn6.addActionListener(ba6);
        btn7.addActionListener(ba7);
        btn8.addActionListener(ba8);
        btn9.addActionListener(ba9);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
    }
}
