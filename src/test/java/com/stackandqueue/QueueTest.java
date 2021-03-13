package com.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

public class QueueTest {
    @Test
    public void givenNumbersPushInStackTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        //take input in stack
        QueueList<Integer> queueList = new QueueList<>();
        queueList.enqueue(firstNode);
        queueList.enqueue(secondNode);
        queueList.enqueue(thirdNode);
        //check true or not
        int result = queueList.printQueue().getKey();
        Assert.assertEquals(56, result);
    }
}
