package labs_examples.generics.labs;
import java.util.ArrayList;

public class SumArray {
    public static <T extends Number> double getSum(ArrayList<T> array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
