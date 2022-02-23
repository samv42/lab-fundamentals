package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Exercise_07 {

    public static void main(String[] args) {
    int fuelTank = 0;
    try{
        StartCar(fuelTank);
    }catch(EmptyTankException one){
        System.out.println("Gas tank must be filled before starting car.");
    }
    }
    public static class EmptyTankException extends Exception {

        @Override
        public String toString() {
            return "Gas tank is empty.";
        }
    }
    public static void StartCar(int fuelTank)throws EmptyTankException{
        if(fuelTank == 0){
            throw new EmptyTankException();
        }else{
            System.out.println("Starting car.");
        }
    }
}