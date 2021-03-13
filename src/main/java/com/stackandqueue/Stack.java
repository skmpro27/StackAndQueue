package com.stackandqueue;

public class Stack<K> {
    private LinkedList<K> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    public void push(Node<K> node) {
        linkedList.add(node);
    }

    public Node<K> printStack() {
        linkedList.printNode();
        return linkedList.head;
    }
}
