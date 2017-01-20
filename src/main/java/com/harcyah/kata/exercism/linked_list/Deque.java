package com.harcyah.kata.exercism.linked_list;

public class Deque<T> {

    private class Element<V> {

        protected Element<V> prev;
        protected Element<V> next;
        protected V value;

        public Element(V value) {
            this.prev = null;
            this.next = null;
            this.value = value;
        }

    }

    protected Element<T> head;
    protected Element<T> tail;

    private boolean empty() {
        return head == null && tail == null;
    }

    // pop (remove value at back)
    public T pop() {
        T value = tail.value;
        if (tail.prev != null) {
            tail.prev.next = null;
            tail = tail.prev;
        }
        return value;
    }

    // shift (remove value at front)
    public T shift() {
        T value = head.value;
        if (head.next != null) {
            head.next.prev = null;
            head = head.next;
        }
        return value;
    }

    // push (insert value at back)
    public void push(T i) {
        if (empty()) {
            insertFirst(i);
        } else {
            Element<T> previousTail = tail;
            tail = new Element<>(i);
            tail.prev = previousTail;
            previousTail.next = tail;
        }
    }

    // unshift (insert value at front)
    public void unshift(T i) {
        if (empty()) {
            insertFirst(i);
        } else {
            Element<T> previousHead = head;
            head = new Element<>(i);
            head.next = previousHead;
            previousHead.prev = head;
        }
    }

    protected void insertFirst(T i) {
        Element<T> e = new Element<>(i);
        head = e;
        tail = e;
    }

}
