package com.adriaanbf04.tema07.ArrayListLearning;

import java.util.Arrays;

public class ArrayListExample {
    private final static float GROW_FACTOR = 2f;
    private int[] data;
    private int size;
    public ArrayListExample(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public int get(int index) {
        return data[index];
    }

    public boolean add(int num) {
        if (size >= data.length) {
            data = resize();
        }
        data[size] = num;
        size++;
        return true;
    }

    private void moveToRight(int index) {
        for (int i = size; i > data.length; i--) {
            data[i] = data[i--];
        }
        size++;
    }

    public boolean add(int index,int num) {
        if (size >= data.length) {
            data = resize();
        }
        moveToRight(index);
        data[index] = num;
        return true;
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
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.append(" ]");
        return "ArrayListExample{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
