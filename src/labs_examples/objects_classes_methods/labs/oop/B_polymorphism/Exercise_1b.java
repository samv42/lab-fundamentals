package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Exercise_1b {
    public static void main(String[] args) {
        Mech Larry = new Mech();
        Mech Jeffery = new Mech();
        Tank Robert = new Tank();

        RobotSet set1 = new RobotSet(Larry);
        set1.testMethods();
        RobotSet setJeff = new RobotSet(Jeffery);
        setJeff.testMethods();
        RobotSet setRob = new RobotSet(Robert);
        setRob.testMethods();
    }


    public static class RobotSet{
        Robot newRobot;

        public RobotSet(Robot newRobot){
            this.newRobot = newRobot;

        }

        public void testMethods(){
            newRobot.Start();
            newRobot.Wave();
            newRobot.Laser();
        }
    }

    public interface Robot {
        public void Start();
        public void Wave();
        public void Laser();
    }

        static class Mech implements Robot{

        @Override
        public void Start(){
            System.out.println("The Mech is starting");
        }

        @Override
        public void Wave(){
            System.out.println("The Mech is waving.");
        }

        @Override
        public void Laser(){
            System.out.println("Mech Laser beam sequence initiated.");
        }

    }

    static class Tank implements Robot{

        @Override
        public void Start(){
            System.out.println("The Tank is starting");
        }

        @Override
        public void Wave(){
            System.out.println("The Tank driver is waving.");
        }

        @Override
        public void Laser(){
            System.out.println("Tank laser beam sequence initiated.");
        }

    }
}
