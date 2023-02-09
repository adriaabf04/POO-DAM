package com.adriaanbf04.tema07.ArrayListLearning;

import java.util.Arrays;

public class CirculeQueque {
    private static final double ERROR = Double.NEGATIVE_INFINITY;
    private static final int DEFAULT_CAPACITY = 10;
    private static final float GROW_FACTORY = 2f;
    private double[] data;
    private int first;
    private int last;

    public CirculeQueque(int capacity) {
        data = new double[capacity];
        first = -1;
        last = -1;
    }
    public CirculeQueque() {
        this(DEFAULT_CAPACITY);
    }

    public boolean add (double value) {
        if (isEmpty()) {
            first = 0;
        } else if (isFull()) {
            data = resize();
        }
        last = (last+1) % data.length;
        data[last] = value;
        return true;
    }

    private double[] resize() {
        double[] array = new double[Math.round(data.length*GROW_FACTORY)];
        int i = first;
        int j = 0;
        while(i != last+1) {
            if (i == data.length && first > last) {
                i = 0;
                continue;
            }
            array[j++] = array[i++];
        }
        first = 0;
        last = j--;
        return array;
    }

    public double remove() {
        if (isEmpty()) {
            return ERROR;
        } else {
            double e = data[first];
            if (first == last) {
                first = -1;
                last = -1;
            } else {
                first = (first++)/data.length;
            }
            return e;
        }
    }

    private boolean isEmpty() {
        return first == -1 || last == -1;
    }

    private boolean isFull() {
        return (first == last++ || (first == 0 && last == data.length-1));
    }

    @Override
    public String toString() {
        return "CirculeQueque{" +
                "data=" + Arrays.toString(data) +
                ", first=" + first +
                ", last=" + last +
                '}';
    }
}
