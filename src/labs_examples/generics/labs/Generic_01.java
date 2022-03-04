package labs_examples.generics.labs;

public class Generic_01 <T, V> {
    T val;
    V val2;

    public Generic_01(T val, V val2){
        this.val = val;
        this.val2 = val2;
    }
    public T getVal(){
        return val;
    }
    public V getVal2(){
        return val2;
    }
    public void setVal(T val){
        this.val = val;
    }
    public void setVal2(V val2){
        this.val2 = val2;
    }
}
