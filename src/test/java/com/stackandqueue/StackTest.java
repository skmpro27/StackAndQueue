package com.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
    @Test
    public void givenNumbersPushInStackTest() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        //take input in stack
        Stack<Integer> stackList = new Stack<>();
        stackList.push(firstNode);
        stackList.push(secondNode);
        stackList.push(thirdNode);
        //check true or not
        int result = stackList.printStack().getKey();
        Assert.assertEquals( 56, result);
    }

    @Test
    public void givenStackPeakStackTest() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        //take input in stack
        Stack<Integer> stackList = new Stack<>();
        stackList.push(firstNode);
        stackList.push(secondNode);
        stackList.push(thirdNode);
        stackList.printStack();
        stackList.pop();
        stackList.printStack();
        //check true or not
        Assert.assertEquals( secondNode.getKey(), stackList.peak());
    }
}
