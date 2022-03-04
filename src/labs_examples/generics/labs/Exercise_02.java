package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(4);
        array1.add(6);
        array1.add(2);
        array1.add(8);
        ArrayList<Double> array2 = new ArrayList<>();
        array2.add(4.2);
        array2.add(6.7);
        array2.add(2.5);
        array2.add(8.9);

        System.out.println(SumArray.getSum(array1));
        System.out.println(SumArray.getSum(array2));
    }

}