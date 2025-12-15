package com.amalitech.testing.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel {

    public static void main(String[] args){
        JFrame frame = new JFrame("Custom JPanel");

        JPanel jPanel = new MyDrawPanel();

        frame.getContentPane().add(jPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        /*
        // Drawing color
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

         */

        /*
        // Drawing Image
        //        Image image = new ImageIcon("christmas_image.jpeg").getImage();
        Image image = new ImageIcon(getClass().getResource("christmas_image.jpeg")).getImage();

        g.drawImage(image, 3, 4, this);

         */

        // Paint a randomly colored circle on a black background
        /*
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);

        Color randCol = new Color(red, green, blue);
        g.setColor(randCol);

        int width = 100;
        int height = 100;
        g.fillOval((this.getWidth() / 2) - width/2, (this.getHeight() / 2) - height/2, 100, 100);
         */

        //Graphics2D
        Graphics2D graphics2D = (Graphics2D) g;

//        GradientPaint gradientPaint = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70, 70, 100, 100);
//        int width = 100;
//        int height = 100;
//        graphics2D.fillOval((this.getWidth() / 2) - width/2, (this.getHeight() / 2) - height/2, width, height);

    }
}
