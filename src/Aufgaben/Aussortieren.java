package Aufgaben;

import java.util.Arrays;
import java.util.Random;

public class Aussortieren {
    public static void main(String[] args) {
        int[] zahlen = new int[30];
        Random rnd = new Random();
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rnd.nextInt(-100, 100);
        }
        ausgabe("alle Zahlen", zahlen);
        ausgabe("negative", reduzieretesArray(zahlen, x -> x < 0));
        ausgabe("gerade zahlen", reduzieretesArray(zahlen, x -> x % 2 == 0) );
        ausgabe("Vielfache", reduzieretesArray(zahlen, x -> x % 7 == 0));
        ausgabe("Quadtratzahl", reduzieretesArray(zahlen, x -> x > 0 && Math.sqrt(x) % 1 == 0));


    }

    public static int[] reduzieretesArray(int[] ia, Pruefung prfg) {
        int Anzahl = 0;
        for (int i : ia
        ) {
            if (prfg.istErfolgreichFuer(i)) Anzahl++;
        }
        int[] newArray = new int[Anzahl];

        int counter = 0;
        for (int i = 0; i < ia.length; i++) {
            if (prfg.istErfolgreichFuer(ia[i])) {
                newArray[counter] = ia[i];
                counter++;
            }
        }
        return newArray;
    }

    public static void ausgabe(String text, int[] ia) {
        System.out.print(text + ":");
        for (int i = 0; i < ia.length; i++) {
            System.out.print(ia[i] + "/");
        }
        System.out.println();
    }
}
