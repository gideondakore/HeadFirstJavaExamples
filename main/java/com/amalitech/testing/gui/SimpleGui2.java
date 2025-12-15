package com.amalitech.testing.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {


    public static void main(String[] args){

        SimpleGui2 gui = new SimpleGui2();

        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame("CHRISTMAS");
        frame.setSize(600, 500);


        ImageIcon icon = new ImageIcon(getClass().getResource("christmas_image.jpeg"));

        Image scaleImage = icon.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaleImage);

        JLabel imageLabel = new JLabel(icon);
        imageLabel.setLayout(new BorderLayout());

        JButton btn = new JButton("Click me!");
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(this);


        imageLabel.add(btn, BorderLayout.CENTER);

        frame.getContentPane().add(imageLabel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){

        Object source = e.getSource();
        if(source instanceof JButton){
            ((JButton) source).setText("⛄ Merry Christmas and Happy New Year ❄");

        }
    }

}
