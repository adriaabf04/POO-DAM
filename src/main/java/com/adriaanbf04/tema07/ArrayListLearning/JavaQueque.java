package com.adriaanbf04.tema07.ArrayListLearning;

import java.util.Random;

public class JavaQueque {
    public JavaQueque() {
        Random random = new Random();
        /*
        final int CAPACITY = 10;
        ClassJavaQueque classJavaQueque = new ClassJavaQueque(CAPACITY);

        for (int i = CAPACITY; i > 0; i--) {
            classJavaQueque.add(i);
        }
        System.out.println(classJavaQueque);
         */

        CirculeQueque correccionQueque = new CirculeQueque(5);
        System.out.println(correccionQueque);
        for (int i = 0; i < 10; i++) {
            correccionQueque.add(i);
        }
        System.out.println(correccionQueque);
        for (int i = 0; i < 10; i++) {
            double num = random.nextDouble() * 10;
            if (random.nextBoolean()) {
                System.out.printf("Encolando %.2f\n",num);
                correccionQueque.add(num);
            } else {
                System.out.printf("Desencolando %.2f\n",correccionQueque.remove());
            }
            System.out.println(correccionQueque);
        }

        System.out.println(correccionQueque);
    }
}
