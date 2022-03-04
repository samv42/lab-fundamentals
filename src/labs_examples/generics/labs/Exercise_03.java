package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */
public class Exercise_03 {
    public static void main(String[] args) {
        String[] array = {"aadaa", "abba", "doggod"};
        Integer[] intArray = {3, 6, 9};
        Double[] doubleArray = {4.5, 12.3, 3.5, 6.7};
        System.out.println(Generic3.doubleSum(4, 4.2));
        System.out.println(Generic3.findPalin(array));
        Generic3.switchArray(0, 2, array);
        Generic3.switchArray(0, 2, intArray);

        System.out.println("the largest number in the array is " +Generic3.largestNum(intArray));
        System.out.println("the largest number in the array is " +Generic3.largestNum(doubleArray));
    }
}