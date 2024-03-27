package edu.dhbw.karlsruhe.moderneprogrammierkonzepte.vl1.part4;

public class WerteTabellen {
    public static void tabelliere (String tit, Funktion1p f) {
        System.out.println("Wertetabelle fuer " + tit);
        System.out.println("      x      f(x)");
        for (double x=1.0; x <=5.0; x++) {
            System.out.printf("% 10.5e % 10.5e\n", x, f.rechne(x));
        }
    }
    public static void main(String[] args) {
        tabelliere("Quadrat", x -> x*x );
        tabelliere("Sinus",   x -> Math.sin(x) );
        tabelliere("Tangens", x -> Math.tan(x) );
    }
}