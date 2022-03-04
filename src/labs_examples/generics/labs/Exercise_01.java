package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01{
    public static void main(String[] args) {
        Generic_01 obj = new Generic_01("Hello", "Goodbye");
        Generic_01 obj2 = new Generic_01(5, 8);
        Generic_01 obj3 = new Generic_01('r', '3');
        System.out.println(obj.getVal());
    }
}