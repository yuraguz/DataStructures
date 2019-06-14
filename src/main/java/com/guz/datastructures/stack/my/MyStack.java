package com.guz.datastructures.stack.my;

public interface MyStack<E> {

    void push(E element);

    E pop();

    E peek();

    int size();

    boolean isEmpty();
}
