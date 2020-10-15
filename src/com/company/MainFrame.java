package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(Game game){
        setSize(400, 400);

        setTitle("Это пример окна");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = super.getContentPane();
        MyPanel mp = new MyPanel(game);
        contentPane.add(mp);
    }

}
