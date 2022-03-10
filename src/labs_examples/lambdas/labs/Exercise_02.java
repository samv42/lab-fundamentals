package labs_examples.lambdas.labs;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
class Exercise_02{
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        double num1 = 45.4;
        double num2 = 67.8;

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        Function<Integer, Integer> sqr = a -> a*a;
        Predicate<Integer> isEqual = a -> a == 5;
        Supplier<Integer> supplyNum = () -> 17;
        Consumer<String> obj = (a) -> System.out.println(a);
        DoubleBinaryOperator doubleAdd = (a, b) -> a + b;
        DoubleFunction divideDouble = a -> a/2;
        ToDoubleFunction<Double> divide4 = a -> a/4;
        BiPredicate<Double, Double> isEqualTo = (a, b) -> a == b;
        DoublePredicate isEqualDouble = a -> a == 45.4;

        System.out.println(sum.apply(x,y));
        System.out.println(sqr.apply(x));
        System.out.println(isEqual.test(x));
        System.out.println(supplyNum.get());
        obj.accept("Printed in consumer object.");
        System.out.println(doubleAdd.applyAsDouble(num1, num2));
        System.out.println(divideDouble.apply(num1));
        System.out.println(divide4.applyAsDouble(num1));
        System.out.println(isEqualTo.test(num1, num2));
        System.out.println(isEqualDouble.test(num1));
    }
        }