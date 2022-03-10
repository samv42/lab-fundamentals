package labs_examples.lambdas.labs;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */
class Exercise_01{
    public static void main(String[] args) {
        int y = 6;
        int z = 4;
        interfaceOne lamPrint = () -> System.out.println("Printing lamPrint");
        interfaceOne anonClass = new interfaceOne() {
            @Override
            public void methodOne() {
            System.out.println("Printing anonClass.");
            }
        };
        interfaceTwo addInt = x -> x + 1;
        interfaceTwo minusInt = new interfaceTwo() {
            @Override
            public int intChange(int x) {
                return x - 2;
            }
        };
        interfaceThree sum = (a, b) -> a + b;
        interfaceThree avrg = (a, b) -> (a + b)/2;
        BiFunction<Integer, Integer, Integer> divide = (a, b) -> a/b;
        Function<Integer, Integer> sqr = a -> a*a;

        lamPrint.methodOne();
        anonClass.methodOne();
        System.out.println("Y plus 1 is " + addInt.intChange(y));
        System.out.println("Y minus 2 is " + minusInt.intChange(y));
        System.out.println("The sum of Y and Z is " + sum.intChange3(y, z));
        System.out.println("The average of Y and Z as an int is " + avrg.intChange3(y, z));
        System.out.println("The Y divided by Z is " + divide.apply(y,z));
        System.out.println("Y squared is " + sqr.apply(y));
    }
}
@FunctionalInterface
interface interfaceOne{
    void methodOne();
}
@FunctionalInterface
interface interfaceTwo{
    int intChange(int x);
}
@FunctionalInterface
interface interfaceThree{
    int intChange3(int x, int y);
}