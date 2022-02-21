package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.net.SocketTimeoutException;

public class Exercise_1 {
    public static void main(String[] args) {
        Book book1 = new Book(200, 10, "First Book");
        System.out.println(book1.toString());

        Novel book2 = new Novel(342, 12, "Second Book", "The Second");
        System.out.println(book2.toString());

        TextBook usa = new TextBook(300, 20, "US History", "Civil War to Reconstruction");
        System.out.println(usa.toString());

        WorkBook french1 = new WorkBook(150, 15, "French History", "French Revolution", 13);
        System.out.println(french1.toString());

        Biography washington = new Biography(400,34, "Revolutionary General", "George Washington");
        System.out.println(washington.toString());

        Novel paleFire = new Novel(334, 40, "Pale Fire", "A Poem in Four Cantos");
        System.out.println(paleFire.toString());

    }
}
