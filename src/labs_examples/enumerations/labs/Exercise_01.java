package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
class Exercise_01{
    public static void main(String[] args) {
        enum1 month1 = new enum1();
        month1.setMonth(Months.March);
        System.out.println(month1.getMonth());

        System.out.println(enum2.Return_Of_The_King.getPageCount());
    }
}
