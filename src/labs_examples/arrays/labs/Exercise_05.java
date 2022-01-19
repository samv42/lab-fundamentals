package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] reverse = new int [10];
        for(int i = 0; i < reverse.length; i++){
            reverse[i] = i * 2;
        }
        for(int x = 9; x >= 0; x -= 2){
            System.out.println(reverse[x] + " ");
        }
    }

}
