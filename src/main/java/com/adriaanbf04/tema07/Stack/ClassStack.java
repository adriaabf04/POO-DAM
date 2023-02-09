package com.adriaanbf04.tema07.Stack;

public class ClassStack {
    private static final int DEFAULT_NUMBER = 10;
    private final static float GROW_FACTOR = 2f;
    private int[] data;
    private int size;

    public ClassStack() {
        this(DEFAULT_NUMBER);
    }

    public ClassStack(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public boolean push(int num) {
        if(full()) {
           resize();
        }
        data[size] = num;
        size++;
        return true;
    }

    public void resize() {
        int[] array = new int[Math.round(data.length*GROW_FACTOR)];
        for(int i=0; i<data.length;i++) {
            array[i] = data[i];
        }
        data = array;
    }

    public void pop() {
        for (int i = 0; i < size; i++) {
            if (i == data.length-1) {
                data[i] = 0;
                size--;
            }
        }
    }

    public int top() {
        return data[size-1];
    }

    public boolean empty() {
        return size == 0;
    }
    public boolean full() {
        return size == data.length;
    }
    public int size() {
        int cont = 0;
        for (int i = 0; i < size; i++) {
            cont++;
        }
        return cont;
    }
}
