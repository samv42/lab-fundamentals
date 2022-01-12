package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 1,000,000,000: ");
        int number = scanner.nextInt();
        System.out.print("Enter a second number between 1 and 1,000,000,000: ");
        int number2 = scanner.nextInt();
        int x;
        int y;
        int sum = 0;
        if (number >= number2) {
            x = number;
            y = number2;
        } else {
            x = number2;
            y = number;
        }

        for (; y <= x; y++) {
            sum += y + x;
            x--;


            }
       int avrg = number + number2 / 2;
        System.out.println ("Sum: " + sum);
        System.out.println ("Average: " + avrg);
    }
}
