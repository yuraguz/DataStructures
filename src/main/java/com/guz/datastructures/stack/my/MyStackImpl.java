package com.guz.datastructures.stack.my;

/**
 * MyStackImpl.
 *
 * @author Iurii_Guz
 */
public class MyStackImpl<E> implements MyStack<E> {

    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;
    private int size;
    private int topElement;

    public MyStackImpl() {
        this.elements = new Object[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
        this.topElement = -1;
    }

    public MyStackImpl(int size) {
        if (size > 0) {
            this.elements = new Object[size];
            this.size = size;
            this.topElement = -1;
        } else {
            throw new IllegalArgumentException("Size can't be negative or zero");
        }
    }

    public void push(E element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Stack is full");
        }
        this.elements[++topElement] = element;
    }

    public E pop() {
        Object element = this.elements[topElement];
        this.elements[topElement] = null;
        topElement--;
        return (E) element;
    }

    public E peek() {
        return (E) this.elements[topElement];
    }

    public int size() {
        return topElement + 1;
    }

    public boolean isEmpty() {
        return topElement == -1;
    }

    private boolean isFull() {
        return topElement >= size - 1;
    }
}
