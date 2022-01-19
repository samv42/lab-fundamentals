package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
import java.util.ArrayList;
public class Exercise_07 {
    public static void main(String[] args){
        ArrayList<String> greetings = new ArrayList();
        greetings.add("Hello");
        greetings.add("Bonjour");
        greetings.add("Shalom");
        greetings.remove("Hello");

        for(String list : greetings){
            System.out.println(list);
        }
        greetings.clear();
        boolean empty = greetings.isEmpty();
    }
}
