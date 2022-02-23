package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Exercise_02 {

    public static void main(String[] args) {
        int[] nums = {3, 79, 45};
        int x = 8;
        int y = 0;
        int z;
        try{
        System.out.println(nums[4]);
        z = x/y;
        }catch(ArrayIndexOutOfBoundsException one){
            System.out.println("Array index out of bounds.");
        }catch(ArithmeticException two){
            System.out.println("Can't divide by zero.");
        }
    }

}
