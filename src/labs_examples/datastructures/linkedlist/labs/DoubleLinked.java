package labs_examples.datastructures.linkedlist.labs;

public class DoubleLinked<D> {
    private Node head;
    private Node previousN = null;

    public DoubleLinked(D... data){
        if(data.length < 1){
            head = null;
        }else{
            for(int i = 0; i < data.length; i++){
                add(data[i]);
            }
        }
    }

    public void add(D data){
        insert(data, size());
    }

    public void push(D data){
        insert(data, 0);
    }
    private void insert(D data, int index){
        if(head == null){
            head = new Node(data);
        }else{
            Node iterator = head;
            Node previous = null;

            if(index == 0){
                head = new Node(data, head);
            }else if(index < size()){
                int count = 0;

                while(count != index){
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }
                previous.next = new Node(data, iterator);
            }else{
                while (iterator.next != null) {
                    iterator = iterator.next;
                }
                iterator.next = new Node(data);
            }
        }
    }
    public void remove(D data){
        if(head.data == data){
            head = head.next;
        }else {
            Node iterator = head;
            Node previous = null;

            while (iterator.next != null) {
                previous = iterator;
                iterator = iterator.next;
            }
            if(iterator.data == data){
                previous.next = null;
            }else{
                System.out.println("Error data not found.");
            }
        }
    }
    public int get(D data){
        try{
            int count = 0;
            Node iterator = head;

            while (iterator.data != data && count < size()) {
                iterator = iterator.next;
                count++;
            }
            return count;
        }catch(NullPointerException ex){
            return -1;
        }
    }

    public int size(){
        Node iterator = head;
        int count = 0;

        while(iterator != null){
            count++;
            iterator = iterator.next;
        }
        return count;
    }
    public void printAll(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node iterator = head;
            for(int i = 0; i < size(); i++){
                System.out.println("Index " + i + ": " + iterator.data);
                iterator = iterator.next;
            }
        }
    }
    public void clear(){
        head = null;
    }
}
