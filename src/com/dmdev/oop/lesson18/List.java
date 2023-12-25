package com.dmdev.oop.lesson18;

public class List<T> {
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
}
