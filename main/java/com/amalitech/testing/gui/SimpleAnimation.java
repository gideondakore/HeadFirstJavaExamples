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

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();


        frame.getContentPane().add(panel);
        frame.setSize(screenSize);
        frame.setVisible(true);



        int frameWidth = (int) screenSize.getWidth();
        int frameHeight = (int) screenSize.getHeight();

        int hypotenuse = (int) Math.sqrt(Math.pow(frameWidth / 2, 2) + (frameHeight * frameHeight));

        IO.println("HYPOTENUSES: " + hypotenuse);

        for(int i = 0; i <= hypotenuse / 2 + 220; i++){
            IO.println("HYPOTENUSES in loop... : " + i);

            xPos += 2;
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

          graphics2D.setColor(Color.white);
          graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());

          graphics2D.setColor(Color.green);
          graphics2D.fillOval(xPos, yPos, 40, 40);
        }
    }
}
