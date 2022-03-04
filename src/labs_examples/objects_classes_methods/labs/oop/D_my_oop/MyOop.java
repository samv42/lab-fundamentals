package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class MyOop {
    public static void main(String[] args) {
    Secretary Martha = new Secretary("Martha", 4, "Secretary", "basic", 16, "Front Desk");
    Business_Analyst Laura = new Business_Analyst("Laura", 5, "Senior Business Analyst", "advanced", 5, 60000, "4B");
    Secretary Tim = new Secretary("Tim", 1, "Secretary", "basic", "HR");
    Business_Analyst Arthur = new Business_Analyst("Arthur", 2, "Business Analyst", "moderate", 2, "3A");

    System.out.println(Martha.toString());
    System.out.println(Laura.toString());
    System.out.println(Tim.toString());
    System.out.println(Arthur.toString());

    Arthur.giveRaise(.02);
    Martha.giveRaise(2);
    System.out.println(Martha.toString());
    System.out.println(Arthur.toString());
    }
}
