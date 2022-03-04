package labs_examples.multi_threading.labs;

public class Sender5 implements Runnable{
    private Data data;

    public Sender5(Data data){
        this.data = data;
    }

    public void run() {
        String packets[] = {
                "One",
                "Two",
                "Three",
                "End"
        };

        for (String packet : packets) {
            data.send(packet);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
    }
}
