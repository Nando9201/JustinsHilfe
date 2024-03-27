import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Integer> zahlen = Arrays.asList(1, 43, 2, -1, 60);

        zahlen.sort((a,b) -> a.compareTo(b));

        zahlen.forEach(a -> System.out.println(a));
    }

    public interface test{
        double calc (double a, double b);
    }
}