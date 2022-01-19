package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avrg;
        int [] num = new int [10];
        for (int i = 0; i < num.length; i++){
            System.out.print("Enter a number between 1 and 1,000,000,000: ");
            num [i] = scanner.nextInt();
        }
        for (int x = 0; x < num.length; x++) {
            sum += num [x];
        }
        avrg = sum/10;
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("And the average is " + avrg);
    }

    }