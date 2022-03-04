package labs_examples.multi_threading.labs;

public class printController {
    int count = 1;
    boolean received = true;

    public synchronized void sendOdd() {
        while (count < 100) {
            while (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
            received = false;

            System.out.println(count);
            count++;
            notifyAll();
        }
    }

    public synchronized void sendEven() {
        while (count < 100) {
            while (count % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted");
                }
            }
            received = false;

            System.out.println(count);
            count++;
            notifyAll();
        }
    }
}
