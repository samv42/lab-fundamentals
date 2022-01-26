package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_3 {
    public static void main(String[] args) {
        SodaType mySodaType = new SodaType("Coca Cola", "Sprite");
        Can myCan = new Can(16);
        Soda mySoda = new Soda(mySodaType, myCan);
        System.out.println(mySoda);
    }
}
class SodaType{
    String brand;
    String type;
    public SodaType(String brand, String type){
        this.brand = brand;
        this.type = type;
    }
    @Override
    public String toString() {
        return "The brand is: " + brand + " and the type is " + type;
    }
}
class Can{
    int size;
    public Can(int size){
        this.size = size;
    }
    @Override
    public String toString() {
        return "Can size: " + size;
    }
}
class Soda{
    SodaType sodaType;
    Can can;
    public Soda(SodaType sodaType, Can can){
        this.sodaType = sodaType;
        this.can = can;
    }
    public String toString() {
        return "Soda: " +
                sodaType.toString() +
                ", " + can + "oz.";
    }
}
