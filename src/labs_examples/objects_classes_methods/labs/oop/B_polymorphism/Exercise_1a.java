package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Exercise_1a {
    public static void main(String[] args) {
        Dog beagle = new Dog();
        beagle.feed();
        beagle.feed("Lettuce");

        Alligator samantha = new Alligator();
        samantha.feed();
        samantha.throwBall();
    }
    public interface Animal {
        public void feed();
        public void pet();
        public void throwBall();
    }
    static class Dog implements Animal{

        public void feed(String string){
            System.out.println("Dogs don't eat strings!");
        }
        @Override
        public void feed(){
        System.out.println("The dog begs for more!");
        }

        @Override
        public void pet(){
            System.out.println("The dog wags its tail.");
        }
        @Override
        public void throwBall(){
            System.out.println("The dog catches the ball!");
        }
    }

    static class Alligator implements Animal{
        @Override
        public void feed(){
            System.out.println("The alligator swallowed it whole!");
        }

        @Override
        public void pet(){
            System.out.println("The alligator bites your hand!");
        }
        @Override
        public void throwBall(){
            System.out.println("The alligator stares glumly.");
        }
    }
}
