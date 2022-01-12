package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scanner.nextLine();
        String vowels = "aeiou";
        int length = str.length();
        int x = 0;
        int y;
        char vowelCheck = str.charAt(x);
        char letter;
        while (x < length) {
            y = 0;
        vowelCheck = str.charAt(x);
            while (y < 5) {
                letter = vowels.charAt(y);
                if (letter == vowelCheck) {
                    System.out.println ("The first vowel is " + letter );
                    return;

                }
                y++;
            }
            x++;

        }
    }
}
