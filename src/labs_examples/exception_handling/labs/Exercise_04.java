package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_04 {

    public static void main(String[] args) {
    int[] nums = {2, 4, 6, 8};
    int x = 0;
    int y = 3;
    int z;

    try{
        System.out.println(nums[5]);
        System.out.println(x);
        try{
            z = y/x;
        }catch(ArithmeticException two){
            System.out.println("Can't divide by zero.");
        }
    }catch(ArrayIndexOutOfBoundsException one){
        System.out.println("Array index out of bounds.");
    }
    }

}