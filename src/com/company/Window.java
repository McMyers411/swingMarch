package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/**
 * Created by am411 on 3/8/17.
 */
public class Window {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JPanel() {

            private final int SIZE = 100;
            private final int INSET = 20;

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(SIZE, SIZE);
            }

            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                g2.setColor(Color.red);
                Line2D line1 = new Line2D.Double(INSET, INSET,
                        getWidth() - INSET, getHeight() - INSET);
                Line2D line3 = new Line2D.Double(INSET, 200,
                        getWidth() - 900, getHeight() - 200);
                Line2D line4 = new Line2D.Double(INSET, 450,
                        getWidth() - 450, getHeight() - 450);
                Line2D line5 = new Line2D.Double(INSET, 900,
                        getWidth() - 200, getHeight() - 900);
                Line2D line6 = new Line2D.Double(INSET, 1000,
                        getWidth() - 1000, getHeight() - 1000);
                Line2D line7 = new Line2D.Double(INSET, 80,
                        getWidth() - 80, getHeight() - 80);
                Line2D line8 = new Line2D.Double(INSET, 300,
                        getWidth() - 300, getHeight() - 300);
                Line2D line9 = new Line2D.Double(INSET, 100,
                        getWidth() - 100, getHeight() - 100);
                Line2D line10 = new Line2D.Double(INSET, 700,
                        getWidth() - 700, getHeight() - 700);
                Line2D line2 = new Line2D.Double(getWidth() - INSET,
                        INSET, INSET, getHeight() - INSET);
                g2.setStroke(new BasicStroke(16,
                        BasicStroke.CAP_SQUARE,
                        BasicStroke.JOIN_BEVEL));
                g2.draw(line1);
                g2.draw(line2);
                g2.draw(line3);
                g2.draw(line4);
                g2.draw(line5);
                g2.draw(line6);
                g2.draw(line7);
                g2.draw(line8);
                g2.draw(line9);
                g2.draw(line10);
                g2.drawString("",INSET,INSET);

            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}

