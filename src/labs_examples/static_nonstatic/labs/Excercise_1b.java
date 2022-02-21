package labs_examples.static_nonstatic.labs;

public class Excercise_1b {
    public static void MethodC(){
        System.out.println("Printed in method c");
    }
    public void MethodD(){
        System.out.println("Printed in method d");
        //8
        Exercise_1a.MethodF();
    }
}
