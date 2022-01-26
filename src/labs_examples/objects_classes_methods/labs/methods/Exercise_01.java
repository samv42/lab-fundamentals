package labs_examples.objects_classes_methods.labs.methods;

import java.sql.SQLOutput;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int x = 8;
        int y = 4;
        int years = 20;
        int seconds = yearsToSeconds(years);
        int mult = multiply(x,y);
        int divi = divide(x,y);
        System.out.println(mult);
        System.out.println(divi);
        joke();
        System.out.println("The number of seconds in " + years + " years is " + seconds);
        int count = lengthVar("Hello", "Goodbye");
        System.out.println("The number of words is " + count);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a+b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Why did the chicken cross the rode?");
        System.out.println("To get to the other side");
        return;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsToSeconds(int years){
        int seconds = years*365*24*60*60;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int lengthVar(String...v){
        int count = 0;
        for(String word: v){
            count++;
        }
        return count;
    }





}
