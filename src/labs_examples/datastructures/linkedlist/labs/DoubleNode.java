package labs_examples.datastructures.linkedlist.labs;

public class DoubleNode<D> {
    D data;
    DoubleNode next;
    DoubleNode previous = null;

    public Node(D data){
        this.data = data;
        this.next = null;
    }

    public Node(D data, DoubleNode Node){
        this.data = data;
        this.next = Node;
    }
}
