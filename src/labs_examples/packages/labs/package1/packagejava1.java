package labs_examples.packages.labs.package1;
import labs_examples.packages.labs.package2.packagejava2;

public class packagejava1 {
    public static void main(String[] args) {
        packagejava1 multiplyOne = new packagejava1();
        packagejava2 multiplyTwo = new packagejava2();
    int x = multiplyOne.Multiply1(5);
    int y = multiplyTwo.multiply2b(4,8);
    }
    public int Multiply1(int a){
        return a*a;
    }
}
