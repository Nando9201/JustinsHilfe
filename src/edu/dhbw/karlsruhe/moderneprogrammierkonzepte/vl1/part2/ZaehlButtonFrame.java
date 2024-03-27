package edu.dhbw.karlsruhe.moderneprogrammierkonzepte.vl1.part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZaehlButtonFrame extends JFrame {
    Container c;                  // Container dieses Frames
    JButton b;                    // Knopf
    int z;                        // Zaehler
    public ZaehlButtonFrame() {   // Konstruktor
        c = getContentPane();          // Container bestimmen
        z = 0;                         // Zaehler auf 0 setzen
        b = new JButton("0");     // Button erzeugen und
        c.add(b);                      // dem Container hinzufuegen

        ActionListener bl =            // Listener-Objekt mit
                new ActionListener() { // anonymer Klasse erzeugen
                    public void actionPerformed(ActionEvent e) {
                        b.setText(++z + "");
                    }
                }; // Ende der anonymen Klassendefinition

        b.addActionListener(bl);     // Listener-Objekt beim
    }                                // Button registrieren

    public static void main(String[] args) {
        JFrame frame = new ZaehlButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}