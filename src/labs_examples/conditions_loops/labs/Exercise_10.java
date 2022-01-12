package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        int x = 2;
        while (x < 100) {
            System.out.println(x);
            if (x % 3 == 0) {
                System.out.println("multiple of three!");
                x++;
                continue;
            }
            x += 2;
        }
    }
}
