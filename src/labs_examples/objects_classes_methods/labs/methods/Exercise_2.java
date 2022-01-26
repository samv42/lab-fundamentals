package labs_examples.objects_classes_methods.labs.methods;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_2 {
        public static void main(String[] args) {
                //indentation won't go away
                Scanner scanner = new Scanner(System.in);
                int largest = largestNum(12, 14, 67, 34);
                boolean isPrime = prime(13);
                int[] array = {5, 4, 3, 7};
                int[][] array2 = {largeSmall(array)};
                reverseArray(array); //part 8
                ArrayList<Integer> numDivisible = new ArrayList(divisbleNums(10, 2, 4));
                System.out.println("Number of divisible numbers: " + numDivisible.size());
                for(int i = 0; i < array2.length; i++){
                        System.out.print("Smallest number: ");
                        for(int j = 0; j <array2[i].length; j++) {
                                System.out.print(array2[i][j]);
                                System.out.println("");
                                System.out.print("Largest number: ");
                        }
                }
                System.out.println("The number is prime: " + isPrime);
                System.out.println(largest);
            System.out.print("Enter a word. ");
            String word = scanner.nextLine();
            int countV = numVowels(word);
            int countC = numCons(word);
            System.out.println("The number of vowels is " + countV);
            System.out.println("The number of consenants is " + countC);
        }
        public static int largestNum(int a, int b, int c, int d){
                if(a > b && a > c && a > d){
                        return a;
                }
                if(b > a && b > c && b > d){
                        return b;
                }
                if(c > a && c > b && c > d){
                        return c;
                } else {
                        return d;
                }

        }
        public static int numVowels(String word){
                String vowels = ("aeiou");
                int count = 0;
                for(int i = 0; i < word.length(); i++){
                        for(int a = 0; a < vowels.length(); a++){
                                if(word.charAt(i) == vowels.charAt(a)){
                                        count++;
                                }
                        }
                }
                return count;
        }
        public static int numCons(String word){
                String consenants = ("bcdfghjklmnpqrstvwxyz");
                int count = 0;
                for(int i = 0; i < word.length(); i++){
                        for(int a = 0; a < consenants.length(); a++){
                                if(word.charAt(i) == consenants.charAt(a)){
                                        count++;
                                }
                        }
                }
                return count;
        }
        public static boolean prime(int x){
                for(int i = x - 1; i > 1; i--){
                        if(x % i == 0){
                                return false;
                        }
                }
                return true;
        }
        public static int[] largeSmall(int...array){
                int smallest = array[0];
                int largest = array[0];
                for (int i = 1; i < array.length; i++) {
                        if (array[i] > largest)
                                largest = array[i];
                        else if (array[i] < smallest)
                                smallest = array[i];
                }
                int[] array2 = {smallest, largest};
                return array2;
        }
        public static ArrayList divisbleNums(int maxNum, int div1, int div2){
                int num = maxNum;
                ArrayList<Integer> list = new ArrayList();
                for(int i = 0; i < maxNum; i++){
                        if(num % div1 == 0 && num % div2 == 0){
                                list.add(num);
                        }
                        num--;
                }
                return list;
        }
        public static void reverseArray(int[] array){
                int tempNum;
                System.out.print("the array reversed is: ");
                for(int i = 0; i < array.length/ 2; i++){
                    tempNum = array[i];
                    array[i] = array[array.length - i -1];
                    array[array.length - i -1] = tempNum;
                }
                for(int num = 0; num < array.length; num++){
                        System.out.print(array[num] + " ");
                }
                System.out.println("");
        }
}
