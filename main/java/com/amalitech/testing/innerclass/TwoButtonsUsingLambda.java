package com.amalitech.testing.innerclass;

import com.amalitech.testing.gui.MyDrawPanel;

import javax.swing.*;
import java.awt.*;

public class TwoButtonsUsingLambda {
    private static final String LABEL_MSG = "I'm a label";

    public static void main(String[] args){
        TwoButtonsUsingLambda gui = new TwoButtonsUsingLambda();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel(LABEL_MSG);


        JButton labelButton = new JButton("Change Label");
        labelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelButton.addActionListener(e -> {
            if(label.getText().equals(LABEL_MSG)) label.setText("Ouch!");
            else if(label.getText().equals("Ouch!")) label.setText(LABEL_MSG);
        });

        JButton colorButton = new JButton("Change color");
        colorButton.setCursor(new Cursor((Cursor.HAND_CURSOR)));
        colorButton.addActionListener(e -> frame.repaint());

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 400);
        frame.setVisible(true);

    }
}
