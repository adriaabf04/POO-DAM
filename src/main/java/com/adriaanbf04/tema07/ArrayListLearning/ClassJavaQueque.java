package com.adriaanbf04.tema07.ArrayListLearning;

import java.io.CharArrayReader;
import java.util.Arrays;

public class ClassJavaQueque {
    private final static float GROW_FACTOR = 2f;
    private int[] data;
    private int size;
    public ClassJavaQueque(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public int get(int index) {
        return data[index];
    }

    public boolean add(int num) {
        if (isFull()) {
           data = resize();
        }
        data[size] = num;
        size++;
        return true;
    }
    private boolean isFull() {
        return size >= data.length;
    }
    public boolean set(int index, int value) {
        if (index > size) {
            return false;
        }
        data[index] = value;
        return true;
    }

    private int[] resize() {
        int[] array = new int[Math.round(data.length*GROW_FACTOR)];
        int i = 0;
        for (int value: data) {
            array[i] = value;
            i++;
        }
        return array;
    }

    @Override
    public String toString() {
        return "ClassJavaQueque{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
