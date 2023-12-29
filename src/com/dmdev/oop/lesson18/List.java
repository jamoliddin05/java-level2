package com.dmdev.oop.lesson18;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class List<T> implements Iterable<T> {
    private T[] elements;
    private int size;

    public List(int initialSize) {
        this.elements =  (T[]) new Object[initialSize];
    }

    public void add(T element) {
        elements[size++] = element;
    }

    public T get(int index) {
        return elements[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
