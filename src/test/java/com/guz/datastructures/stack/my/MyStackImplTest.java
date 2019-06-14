package com.guz.datastructures.stack.my;

import static org.junit.Assert.assertEquals;

import java.util.Deque;
import java.util.Stack;
import org.junit.Test;

public class MyStackImplTest {

    @Test
    public void shouldCreateStack() {
        MyStack<String> stack = new MyStackImpl<>(15);
        assertEquals(stack.size(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStackInitializedWithEmptySize() {
        new MyStackImpl<>(0);
    }

    @Test
    public void shouldPushElement() {
        MyStack<String> stack = new MyStackImpl<>();
        stack.push("Bob");
        assertEquals(stack.size(), 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenPushToFullStack() {
        MyStack<String> stack = new MyStackImpl<>(1);
        stack.push("Bob");
        stack.push("Peter");
    }

    @Test
    public void shouldPop() {
        MyStack<String> stack = new MyStackImpl<>(5);
        stack.push("Bob");
        stack.push("Peter");
        stack.push("John");
        assertEquals(stack.size(), 3);

        String name = stack.pop();
        assertEquals(name, "John");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void shouldPeek() {
        MyStack<String> stack = new MyStackImpl<>(5);
        stack.push("Bob");
        stack.push("Peter");
        stack.push("John");
        assertEquals(stack.size(), 3);

        String name = stack.peek();
        assertEquals(name, "John");
        assertEquals(stack.size(), 3);
    }

}