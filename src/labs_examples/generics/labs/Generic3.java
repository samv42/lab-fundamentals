package labs_examples.generics.labs;

public class Generic3 {
    public static <T extends Number, V extends Number> double doubleSum(T val1, V val2){
        double sum = val1.doubleValue() + val2.doubleValue();
        return sum;
    }

    public static int findPalin(String[] list){
        int count = 0;
        boolean isPalin = true;
        for(String str : list){
            int i = 0;
            int j = str.length() - 1;

            while (i < j) {
                if (str.charAt(i) != str.charAt(j)){
                    isPalin = false;
                    break;
                }
                i++;
                j--;
            }
            if(isPalin == true){
                count++;
            }
            isPalin = true;
        }
        return count;
    }
    public static <T> void switchArray(int index1, int index2, T[] array){
        T temp = array[index1];
        System.out.println("Switching vallue " + array[index1] + " and " + array[index2]);
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println("Done! the first index is now " + array[index1] + " and the second " + array[index2]);
    }
    public static <T extends Number> double largestNum(T[] array){
        double largest = array[0].doubleValue();
        for(int i = 1; i < array.length; i++){
            if(array[i].doubleValue() > largest){
               largest = array[i].doubleValue();
            }
        }
        return largest;
    }
}
