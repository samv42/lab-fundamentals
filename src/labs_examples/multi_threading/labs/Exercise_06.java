package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class Exercise_06{
    public static void main(String[] args) {
    printController print = new printController();
    Thread printer1 = new Thread(new printOdd(print));
    Thread printer2 = new Thread(new printEven(print));

    printer1.start();
    printer2.start();
    }
}