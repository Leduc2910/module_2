package DSA;

import java.util.List;

class Node<E> {
    public E element;
    public Node<E> next;

    Node(E element) {
        this.element = element;
        this.next = null;
    }
}

public class Linkedlist<E> {
    public Node<E> head;
    public Node<E> tail;

    Linkedlist() {

    }

    public void add(E e) {
        Node<E> node = new Node<E>(e);
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void show() {
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.next;

        }
    }
}

class Main {
    public static void main(String[] args) {
        Linkedlist<Integer> linkedlist = new Linkedlist<>();
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(5);
        linkedlist.show();
    }


}
