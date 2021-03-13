package com.stackandqueue;

public class LinkedList<K> {
    public Node<K> head;
    public Node<K> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Node<K> newNode) {
        if (head == null)
            head = newNode;

        if (tail == null)
            tail = newNode;
        else {
            Node<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printNode() {
        Node<K> tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getKey());
            System.out.print((tempNode.getNext() == null) ? "" : " -> ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
}