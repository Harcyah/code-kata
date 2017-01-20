package com.harcyah.kata.exercism.simple_linked_list;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class SimpleLinkedList {

    private static class Element {

        private Element prev;
        private int data;

        public Element(int data) {
            this.data = data;
            this.prev = null;
        }

        public Element(int data, Element prev) {
            this.data = data;
            this.prev = prev;
        }

    }

    private Element tail;
    private int size;

    public SimpleLinkedList() {
        tail = null;
        size = 0;
    }

    public SimpleLinkedList(Integer[] values) {
        for (int value : values) {
            push(value);
        }
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (tail == null) {
            throw new NoSuchElementException();
        }

        int value = tail.data;
        if (tail.prev == null) {
            tail = null;
        } else {
            tail = tail.prev;
        }
        size--;

        return value;
    }

    public void push(int value) {
        if (tail == null) {
            tail = new Element(value);
        } else {
            tail = new Element(value, tail);
        }
        size++;
    }

    public void reverse() {
        if (tail == null) {
            return;
        }

        tail = reverse(tail);
    }

    protected Element reverse(Element element) {
        Element head = new Element(tail.data);
        Element curr = tail;
        while (curr != null) {
            head = new Element(curr.data, head);
            curr = curr.prev;
        }
        return head;
    }

    @SuppressWarnings("unchecked")
    public <T> T[] asArray(Class<T> clazz) {
        T[] out = (T[]) Array.newInstance(clazz, size);
        int index = 0;
        Element elt = tail;
        while (elt != null) {
            Array.set(out, index, elt.data);
            index++;
            elt = elt.prev;
        }
        return out;
    }

}
