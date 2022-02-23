package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Exercise_03 {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        try{
            System.out.println(nums[5]);
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Array index out of bounds.");
        } finally{
            System.out.println("Finished");
        }
    }

}