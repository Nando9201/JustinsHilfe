package edu.dhbw.karlsruhe.moderneprogrammierkonzepte.vl1.part1;

public class ZweiRunnables {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {       // Runnable-Objekt mit
            public void run() {              // anonymer Klasse
                BuchstabenDruck.drucke();
            }
        };
        Runnable r2 = () -> BuchstabenDruck.drucke();
        // Runnable-Objekt mit Lambda-Ausdruck

        new Thread(r1).start();     // Beide als Thread starten
        new Thread(r2).start();
    }
}