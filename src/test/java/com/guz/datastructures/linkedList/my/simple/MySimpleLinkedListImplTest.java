package com.guz.datastructures.linkedList.my.simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * MySimpleLinkedListImplTest.
 *
 * @author Iurii_Guz
 */
public class MySimpleLinkedListImplTest {

    @Test
    public void shouldInitialized() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldAddElement() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");

        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
    }

    @Test
    public void shouldAddMultipleElements() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");
        list.insertFirst("Peter");
        list.insertFirst("Ted");

        assertFalse(list.isEmpty());
        assertEquals(list.size(), 3);
    }

    @Test
    public void shouldRemoveInTheMiddleOfList() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");
        list.insertFirst("Peter");
        list.insertFirst("Ted");
        list.insertFirst("Jane");

        assertEquals(list.size(), 4);
        System.out.println(list);

        list.remove("Ted");
        assertEquals(list.size(), 3);
        System.out.println(list);
    }

    @Test
    public void shouldDeleteFirstElement() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");
        list.insertFirst("Peter");
        list.insertFirst("Ted");
        list.insertFirst("Jane");

        assertEquals(list.size(), 4);
        System.out.println(list);

        list.deleteFirst();
        assertEquals(list.size(), 3);
        System.out.println(list);
    }

    @Test
    public void shouldRemoveFirstElement() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");
        list.insertFirst("Peter");
        list.insertFirst("Ted");
        list.insertFirst("Jane");

        assertEquals(list.size(), 4);
        System.out.println(list);

        list.remove("Jane");
        assertEquals(list.size(), 3);
        System.out.println(list);
    }

    @Test
    public void shouldRemoveLastElement() {
        MySimpleLinkedList<String> list = new MySimpleLinkedListImpl<>();
        list.insertFirst("Bob");
        list.insertFirst("Peter");
        list.insertFirst("Ted");
        list.insertFirst("Jane");

        assertEquals(list.size(), 4);
        System.out.println(list);

        list.remove("Bob");
        assertEquals(list.size(), 3);
        System.out.println(list);
    }

}