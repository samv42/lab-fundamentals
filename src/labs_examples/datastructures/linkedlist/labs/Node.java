package labs_examples.datastructures.linkedlist.labs;

public class Node<D> {
    D data;
    Node next;

    public Node(D data){
        this.data = data;
        this.next = null;
    }

    public Node(D data, Node node){
        this.data = data;
        this.next = node;
    }
}
