package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 5;
        while (x < 100) {
            System.out.println(x);
            if (x % 3 == 0) {
                System.out.println("done!");
                break;
            }
            x += 2;
        }
    }
}
