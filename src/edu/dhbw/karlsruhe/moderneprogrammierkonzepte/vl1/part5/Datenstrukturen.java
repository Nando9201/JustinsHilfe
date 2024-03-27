package edu.dhbw.karlsruhe.moderneprogrammierkonzepte.vl1.part5;

import java.util.Arrays;
import java.util.List;

public class Datenstrukturen {
    public static void main(String[] args) {
        List<Integer> zahlen = Arrays.asList(1,3,5,7,8,6,4,2);

        zahlen.forEach(k -> System.out.print(k + "  "));
        System.out.println();

        zahlen.replaceAll(k -> k*k);

        zahlen.forEach(k -> System.out.print(k + "  "));
        System.out.println();

        zahlen.sort((a,b) -> a-b);

        zahlen.forEach(k -> System.out.print(k + "  "));
        System.out.println();
    }
}
