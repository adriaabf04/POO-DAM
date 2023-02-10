package com.adriaanbf04.tema07.StackGeneric;
import java.util.ArrayList;
public class StackClass<T> {
    private ArrayList<T> data;

    public StackClass() {
        data = new ArrayList<>();
    }

    public T push(T value) {
        data.add(value);
        return value;
    }

    public T pop() {
        T e = top();
        data.remove(data.size()-1);
        return e;
    }

    public T top() {
        return data.get(data.size()-1);
    }

    public int size() {
        return data.size();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
