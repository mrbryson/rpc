package com.company;

import javax.swing.JFrame;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        int resx = 600,resy = 600;

        frame.setSize(resx,resy);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Rock Paper Scissors");
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(3);
    }
}
