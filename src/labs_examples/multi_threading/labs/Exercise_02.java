package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class Exercise_02 {
    public static void main(String[] args) {
    runThread thread1 = new runThread("thread 1");
    }
}

class runThread extends Thread{
    runThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println(getName() + " is running.");
    }
}