package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
class Exercise_01{
    public static void main(String[] args) {
        Runnable1 run1 = new Runnable1();
        Thread thread1 = new Thread(run1, "thread 1");
        thread1.start();
        thread1.setPriority(7);

        Thread thread2 = new Thread(new Runnable1(), "thread 2");
        thread2.start();

    }
}

class Runnable1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running " + Thread.currentThread().getName() + " " + i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}

