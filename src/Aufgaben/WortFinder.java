package Aufgaben;

public class WortFinder {
    public static String erstesWort (String[] str, Bedingung bedingung){
        for (int i = 0; i < str.length; i++) {
            if(bedingung.trifftZuAuf(str[i])) return str[i];
        }
        return "";
    }

    public static void main(String[] args) {
        String[] testdaten = TestDaten.erzeuge();

        System.out.println(erstesWort(testdaten, x -> x.toCharArray()[0] == 'a'));
        System.out.println(erstesWort(testdaten, x -> x.contains("au")));
        System.out.println(erstesWort(testdaten, x -> x.endsWith("suppe")));
        System.out.println(erstesWort(testdaten, x -> x.toCharArray().length == 8));

    }
}
