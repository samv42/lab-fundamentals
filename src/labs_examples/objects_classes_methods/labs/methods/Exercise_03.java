package labs_examples.objects_classes_methods.labs.methods;
import java.util.Scanner;
/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = factorial(5);
        int total;
        System.out.println(x);
//        should print 120
        System.out.print("Enter a number between 1 and 1,000,000,000: ");
        int number = scanner.nextInt();
        total = factorial(number);
        System.out.println("The factorial of " + number + " is " + total);

    }
    public static int factorial(int x){
        int total;
        if(x==1){
            return 1;
        }
        total = factorial(x - 1) * x;
        return total;
    }




}

