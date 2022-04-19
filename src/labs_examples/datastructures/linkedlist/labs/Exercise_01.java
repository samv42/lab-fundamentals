package labs_examples.datastructures.linkedlist.labs;
import java.util.*;
import java.util.ListIterator;
/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */
class Exercise_01{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> words = new ArrayList<>();
        list.add("Hello");
        words.add("Goodbye");
        words.add("another word");
        words.add("more words");
        list.addAll(words);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(5));
        list.set(3, "new word");
        list.push("Bonjour");
        list.pop();
        list.remove(1);
        boolean goodbye = list.contains("Goodbye");

        ListIterator printList = list.listIterator(2);
        while(printList.hasNext()){
            System.out.println(printList.next());
        }
        list.clear();
    }
}