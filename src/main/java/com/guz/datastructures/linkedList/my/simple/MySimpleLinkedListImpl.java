package com.guz.datastructures.linkedList.my.simple;

import java.util.Objects;

/**
 * MySimpleLinkedListImpl.
 *
 * @author Iurii_Guz
 */
public class MySimpleLinkedListImpl<E> implements MySimpleLinkedList<E> {

    private MySimpleLink<E> first;
    private int size;

    public MySimpleLinkedListImpl() {
        this.size = 0;
    }

    public void insertFirst(E element) {
        MySimpleLink<E> link = new MySimpleLink<>(element);
        link.setNext(first);
        first = link;
        size++;
    }

    public void deleteFirst() {
        MySimpleLink<E> link = this.first;
        this.first = link.getNext();
        size--;
    }

    public E find(E element) {
        MySimpleLink<E> current = first;
        while (current != null) {
            if (Objects.equals(current.getData(), element)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void remove(E element) {

        MySimpleLink<E> last = null;
        MySimpleLink<E> current = this.first;

        while (current != null) {
            if (Objects.equals(current.getData(), element)) {

                MySimpleLink<E> next = current.getNext();
                if (last != null) {
                    last.setNext(next);
                } else {
                    this.first = next;
                }
                size--;
                break;
            }
            last = current;
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        MySimpleLink<E> current = this.first;
        while (current != null) {
            sb.append(current.toString() + "\n");
            current = current.getNext();
        }
        return sb.toString();
    }

    private static class MySimpleLink<E> {

        private E data;
        private MySimpleLink<E> next;

        private MySimpleLink(E element) {
            this.data = element;
        }

        public E getData() {
            return data;
        }

        public void setNext(MySimpleLink<E> next) {
            this.next = next;
        }

        public MySimpleLink<E> getNext() {
            return next;
        }

        public String toString() {
            return "{ Element = [" + data.toString() + "] }";
        }
    }

}
