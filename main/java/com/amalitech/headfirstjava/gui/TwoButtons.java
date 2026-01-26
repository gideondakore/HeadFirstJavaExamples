package com.amalitech.headfirstjava.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    private JFrame frame;
    private JLabel label;

    public static void main(String[] args){
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();
//        drawPanel.add(BorderLayout.SOUTH, colorButton);
//        drawPanel.add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(600, 400);
        frame.setVisible(true);

    }

    public class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            if(label.getText().equals("I'm a label")) label.setText("Ouch!");
            else if(label.getText().equals("Ouch!")) label.setText("I'm a label");

        }
    }

    public class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){

            frame.repaint();
        }
    }
}
