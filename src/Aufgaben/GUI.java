package Aufgaben;

import javax.swing.*;
import java.util.Random;

public class GUI {
    public static void main(String[] args) {
        JButton[] btn = new JButton[3];
        Runnable r = () -> {
            Random rnd = new Random();
            while (true) {
                btn[rnd.nextInt(3)].doClick();
            }
        };

       Thread t = new Thread(r);


        JFrame frame = new JFrame("Lamda-Frame");

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.GridLayout(1, 3));

        btn[0] = new JButton();
        btn[0].setText("0");
        btn[0].addActionListener(x -> {
            int i = Integer.valueOf(btn[0].getText()) + 1;
            if(i == 1000) t.interrupt();
            btn[0].setText(""+i);

        });
        frame.add(btn[0]);

        btn[1] = new JButton();
        btn[1].setText("0");
        btn[1].addActionListener(x -> {
            int i = Integer.valueOf(btn[1].getText()) + 1;
            if(i == 1000) t.interrupt();
            btn[1].setText(""+i);

        });
        frame.add(btn[1]);

        btn[2] = new JButton();
        btn[2].setText("0");
        btn[2].addActionListener(x -> {
            int i = Integer.valueOf(btn[2].getText()) + 1;
            if(i == 1000) t.interrupt();
            btn[2].setText(""+i);

        });
        frame.add(btn[2]);

        frame.setVisible(true);
        t.start();


    }
}
