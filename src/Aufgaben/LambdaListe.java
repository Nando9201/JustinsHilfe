package Aufgaben;

import java.util.Arrays;
import java.util.List;

public class LambdaListe {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(11, 21, 24, 36, 41, 55, 62, 66);

        liste.forEach(x -> System.out.print(x + " "));
        System.out.println();
        liste.sort((a,b) -> a % 8 - b % 8);
        liste.forEach(x -> System.out.print(x + " "));
    }
}
