package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */
class Exercise_06 {

    public static void main(String[] args) {
    int[] array = {3, 6, 9};
        try {
            int x = ArrayIndex(array);
        }catch(ArrayIndexOutOfBoundsException one){
            System.out.println("Array index out of bounds.");
        }
    }

    public static int ArrayIndex(int[] array)throws ArrayIndexOutOfBoundsException{
        return array[5];
    }
}
