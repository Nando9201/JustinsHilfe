package edu.dhbw.karlsruhe.moderneprogrammierkonzepte.vl1.part3;

public class Einsatz {

    public static void main(String[] args) {

        Funktion2p f = (a,b) -> a + b;

        Funktion2p g = (u,v) -> u * v;

        double erg1 = f.rechne(42.42, 17.17); // ergibt 59.59

        double erg2 = g.rechne(5.0, 17.2);    // ergibt 86.0

    }
}
