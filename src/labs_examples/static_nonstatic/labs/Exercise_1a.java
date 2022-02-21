package labs_examples.static_nonstatic.labs;

public class Exercise_1a {
    public static void main(String[] args) {
        //1.
        int mult = StaticMult(3,4);
        System.out.print("Static multiply method: " + mult);
        //2
        Exercise_1a obj = new Exercise_1a();
        obj.MethodB();
        //3
        Excercise_1b.MethodC();
        //4
        Excercise_1b obj2 = new Excercise_1b();
        obj2.MethodD();
        //5
        obj.MethodE();

    }

    public static int StaticMult(int a, int b){
        return a*b;
    }
    public void MethodB(){
        System.out.println("Printed in MethodB.");
    }
    public void MethodE(){
        MethodB();
        //6
        Excercise_1b obj3 = new Excercise_1b();
        obj3.MethodD();
        //7
        MethodF();
    }
    public static void MethodF(){
        System.out.println("Printed in MethodF.");
    }
}
