package com.stackandqueue;

public class QueueList<K> {

    private final LinkedList<K> linkedList;

    public QueueList() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(Node<K> node) {
        linkedList.append(node);
    }

    public Node<K> printQueue() {
        linkedList.printNode();
        return linkedList.head;
    }
}
