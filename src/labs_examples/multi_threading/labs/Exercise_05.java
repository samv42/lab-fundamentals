package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */
class Exercise_05{
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender5(data));
        Thread receiver = new Thread(new Reciever5(data));

        sender.start();
        receiver.start();

    }
}


