package labs_examples.objects_classes_methods.labs.objects;

//All airplane exercises
public class Exercise1 {
    public static void main(String[] args) {
        AirplaneEngine myEngine = new AirplaneEngine("M35");
        Wing myWing = new Wing("Boeing");
        Model myModel = new Model(1.35);
        FuelTank myFuelTank = new FuelTank(35, 15.5);
        Airplane myAirplane = new Airplane(myFuelTank, myEngine, myWing, myModel);
        System.out.println("My airplane: " + myAirplane.toString());

        AirplaneEngine deltaEngine = new AirplaneEngine("N56");
        Wing deltaWing = new Wing("Boeing");
        Model deltaModel = new Model(1.78);
        FuelTank deltaFuelTank = new FuelTank(50, 42.5);
        Airplane deltaAirplane = new Airplane(myFuelTank, myEngine, myWing, myModel);
        System.out.println("Delta airplane: " + deltaAirplane.toString());
    }
}
    class Airplane{
        FuelTank fuelTank;
        AirplaneEngine airplaneEngine;
        Wing wing;
        Model model;
        public Airplane(FuelTank fuelTank, AirplaneEngine airplaneEngine, Wing wing, Model model){
            this.fuelTank = fuelTank;
            this.airplaneEngine = airplaneEngine;
            this.wing = wing;
            this.model = model;
        }
        @Override
        public String toString() {
            return "Airplane{" +
                    "engine=" + airplaneEngine.toString() +
                    ",\n wing=" + wing.toString() +
                    ",\n model='" + model + '\'' +
                    ",\n Fuel Tank='" + fuelTank + '\'' +
                    '}';
        }

    }
    class FuelTank {
        private double fuelCapacity;
        private double currentFuel;
        public FuelTank(double fuelCapacity, double currentFuel){

            this.fuelCapacity = fuelCapacity;
            this.currentFuel = currentFuel;

        }
        @Override
        public String toString() {
            return "Fuel Tank{" +
                    "Fuel Capacity = " + fuelCapacity + " and Current Fuel " + currentFuel +
                    '}';
        }
    }

    class AirplaneEngine{
        private String engineModel;
        public AirplaneEngine(String engineModel){
            this.engineModel = engineModel;
        }
        @Override
        public String toString() {
            return "Engine{" +
                    "Engine model = " + engineModel +
                    '}';
        }
    }
    class Wing {
        String brand;
        public Wing(String brand){
            this.brand = brand;
        }
        @Override
        public String toString() {
            return "Wing{" +
                    "Brand = " + brand +
                    '}';
        }
    }
    class Model {
        double gen;
        public Model(double gen){
            this.gen = gen;
        }
        @Override
        public String toString() {
            return "Model{" +
                    "Generation = " + gen +
                    '}';
        }
    }

