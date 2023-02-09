package com.adriaanbf04.tema07.ArrayListLearning;

import java.util.Arrays;

public class CorreccionQueque {
    private static final double ERROR = Double.NEGATIVE_INFINITY;
    private static final int DEFAULT_CAPACITY = 10;
    private static final float GROW_FACTORY = 2f;
    private double[] data;
    private int size;

    public CorreccionQueque() {
        this(DEFAULT_CAPACITY);
    }
    public CorreccionQueque(int capacity) {
        data = new double[capacity];
        size = 0;
    }

    public boolean add(double value) {
        if(isFull()) {
            data = resize();
        }
        data[size] = value;
        size++;
        return true;
    }

    public double remove() {
        if (isEmpty()) {
            return ERROR;
        }
        double result = data[0];
        moveToLeft();
        return result;
    }

    private void moveToLeft() {
        for (int i = 0; i < size-1; i++) {
            data[i] = data[i++];
        }
        data[size--] = ERROR;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private double[] resize() {
        double[] array = new double[Math.round(data.length*GROW_FACTORY)];
        int i = 0;
        for (double value: data) {
            array[i] = value;
            i++;
        }
        return array;
    }

    private boolean isFull() {
        return size >= data.length;
    }

    @Override
    public String toString() {
        return "CorreccionQueque{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
