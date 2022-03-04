package labs_examples.multi_threading.labs;

public class printOdd implements Runnable{
    printController print;

    public printOdd (printController print){
        this.print = print;
    }
    @Override
    public void run(){
        print.sendOdd();
    }
}
