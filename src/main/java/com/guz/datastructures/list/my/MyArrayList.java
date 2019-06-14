package com.guz.datastructures.list.my;

import java.util.Iterator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_SIZE = 10;

    private Object[] array;

    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    public void add(E element) {
        array[size++] = element;
    }

    public E get(int index) {
        throw new NotImplementedException();
    }

    public int size() {
        return size;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }



        if (object instanceof MyList) {




            return true;
        }

        return false;
    }

    public int hashCode() {
        return -1;
    }

}
