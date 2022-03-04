package labs_examples.multi_threading.labs;

public class printEven implements Runnable{
    printController print;

    public printEven (printController print){
        this.print = print;
    }
    @Override
    public void run(){
        print.sendEven();
    }
}
