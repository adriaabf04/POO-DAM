package com.adriaanbf04.tema07.Stack;


public class StackExample {
    public StackExample() {
        final int CAPACITY = 5;
        ClassStack stackOne = new ClassStack(CAPACITY);
        for(int i=1; i<=CAPACITY;i++) {
            stackOne.push(i);
        }
        System.out.printf("The top of the stack is: %d\n",stackOne.top());
        System.out.println(stackOne);
        stackOne.pop();
        System.out.println("Stack deleting the first number: ");
        System.out.println(stackOne);
    }

}
