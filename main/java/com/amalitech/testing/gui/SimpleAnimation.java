package com.amalitech.testing.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

public class SimpleAnimation {
    private int xPos = 0;
    private int yPos = 0;

    public static void main(String[] args){
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for(int i = 0; i < Math.sqrt((Math.pow(frame.getWidth(), 2) + Math.pow(frame.getHeight(), 2))); i++){
            xPos++;
            yPos++;

            panel.repaint();

            try{
                TimeUnit.MILLISECONDS.sleep(50);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public class MyDrawPanel extends JPanel{

        @Override
        public void paintComponent(Graphics g){
          Graphics2D graphics2D = (Graphics2D) g;
          graphics2D.fillOval(xPos, yPos, 40, 40);
        }
    }
}
