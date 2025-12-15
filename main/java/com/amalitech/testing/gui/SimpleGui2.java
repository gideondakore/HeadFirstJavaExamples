package com.amalitech.testing.gui;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui2 implements ActionListener {

    public static void main(String[] args){
       SimpleGui2 gui = new SimpleGui2();
       gui.go();
    }


    public void go(){
        JFrame frame = new JFrame();
        JButton btn = new JButton("Click me!");

        btn.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.getContentPane().add(btn);

        frame.setSize(300, 300);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e){
        ((JButton) e.getSource()).setText("Merry christmas");
        if(e.getSource() == JButton.class){
            ((JButton) e.getSource()).setText("\nand\nHappy New Year");
        }
    }
}
