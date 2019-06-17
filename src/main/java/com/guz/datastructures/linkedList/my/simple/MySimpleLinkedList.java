package com.guz.datastructures.linkedList.my.simple;

public interface MySimpleLinkedList<E> {

    void insertFirst(E element);

    void deleteFirst();

    E find(E element);

    void remove(E element);

    boolean isEmpty();

    int size();
}
