package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
    int x = 4;
    int y = 0;
    try {
        int z = divide(x, y);
    }catch(ArithmeticException one){
        System.out.println("Can't divide by zero.");
    }
    }

    public static int divide(int x, int y)throws ArithmeticException{
        return x/y;
    }
}