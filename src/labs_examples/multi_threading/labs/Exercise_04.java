package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
class Exercise_04{
    public static void main(String[] args) {
        Sender snd = new Sender();
    SyncRun message1 = new SyncRun("Shalom", snd);
    SyncRun message2 = new SyncRun("Lilah tov", snd);
    try{
        message1.thread.join();
        message2.thread.join();
    }catch (Exception e){
        System.out.println("thread interrupted.");
    }
    }
}

class SyncRun implements Runnable{
    Thread thread;
    String msg;
    Sender sender;

    public SyncRun(String msg, Sender snd){
        this.msg = msg;
        thread = new Thread(this, msg);
        sender = snd;
        thread.start();
    }

    @Override
    public void run(){
        synchronized (sender){
            sender.send(msg);
        }
    }
}

class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg );
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}