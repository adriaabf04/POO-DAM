package com.adriaanbf04.tema07.ArrayListLearning;

public class TestArryList {
    public TestArryList() {
        ArrayListExample arrayListExample = new ArrayListExample(10);
        for (int i = 0; i < 10; i++) {
            arrayListExample.add(i);
        }
        System.out.println(arrayListExample);
        arrayListExample.add(5,20);
        System.out.println(arrayListExample);
    }
}
